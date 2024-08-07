/**
 *
 */
package com.alxvn.backlog.util;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author KEDD
 *
 */
public class Helper {

	private static final Logger log = LoggerFactory.getLogger(Helper.class);

	private Helper() {
		throw new IllegalStateException("Utility class");
	}

	private static final String[] listAccept = { "SYMPHO", "IFRONT", "KOUJIWEB", "SYMPHO05", "ETSURAN" };
	public static final List<String> PROJECT_ACCEPT = Arrays.asList(listAccept);

	private static String getAnkenNo(final String target, final String content) {
		final var backlogSymPattern = "(" + target + "-\\d+((\\S*)comment-[^ ]+)?)";
		final var patternBacklog = Pattern.compile(backlogSymPattern);
		final var matcherSymBacklog = patternBacklog.matcher(content);
		if (matcherSymBacklog.find()) {
			return StringUtils.defaultString(matcherSymBacklog.group(1));
		}
		return StringUtils.EMPTY;
	}

	public static String getAnkenNo(final String content) {

		// split first space for ticket no
//		CATV_SCHEDULE-3068 SYMPHO05-1 Q&Aレビュー 
		final var parts = StringUtils.split(content);
		if (Objects.nonNull(parts) && parts.length > 0) {
			final var defaultAnkenNo = PROJECT_ACCEPT.stream().map(t -> getAnkenNo(t, parts[0]))
					.filter(StringUtils::isNotBlank).findFirst().orElse(StringUtils.EMPTY);
			if (StringUtils.isNotBlank(defaultAnkenNo)) {
				return defaultAnkenNo;
			}
			final var firstPart = parts[0];
			if (PROJECT_ACCEPT.stream().anyMatch(p -> StringUtils.contains(firstPart, p))) {
				return firstPart;
			}
		}

		// use for backlog sym
		final var backlogSymPattern = "(SYMPHO-\\d+((\\S*)comment-[^ ]+)?)";
		final var patternBacklog = Pattern.compile(backlogSymPattern);
		final var matcherSymBacklog = patternBacklog.matcher(content);
		if (matcherSymBacklog.find()) {
			return StringUtils.defaultString(matcherSymBacklog.group(1));
		}
		// use for backlog ifront
		final var backlogifrontPattern = "(IFRONT-\\d+((\\S*)comment-[^ ]+)?)";
		final var patternIFrontBacklog = Pattern.compile(backlogifrontPattern);
		final var matcherIfrontBacklog = patternIFrontBacklog.matcher(content);
		if (matcherIfrontBacklog.find()) {
			return StringUtils.defaultString(matcherIfrontBacklog.group(1));
		}

		// using redmine
		final var pattern = Pattern.compile("(#?\\d+((\\S*)[comment|note]-[^ ]+)?)");
		final var matcher = pattern.matcher(content);
		if (matcher.find()) {
			return StringUtils.defaultString(matcher.group(1));
		}

		// use for redmine #xxxx
		final var redminePattern = "#\\d+";
		final var patternRedmine = Pattern.compile(redminePattern);
		final var matcherRedmine = patternRedmine.matcher(content);
		if (matcherRedmine.find()) {
			return StringUtils.defaultString(matcherRedmine.group(0));
		}

		return StringUtils.defaultString(content);
	}

	public static String getWorkPhase(final String ankenNo, final String content) {
		if (!StringUtils.equals(ankenNo, content) && StringUtils.isNotBlank(ankenNo)
				&& StringUtils.isNotBlank(content)) {
			final var index = StringUtils.indexOf(content, ankenNo);
			if (index >= 0) {
				final var result = content.substring(index);
				final var parts = StringUtils.split(StringUtils.trim(StringUtils.remove(result, ankenNo)));
				if (Objects.nonNull(parts) && parts.length > 0) {
					final var firstPart = parts[0];
					log.debug("getWorkPhase.rs: {}", firstPart);
					return firstPart;
				}
			}
		}
		return Strings.EMPTY;
	}

	public static String getTargetProject(final String ankenNo, final String defaultTargetCustomer) {
		final var parts = StringUtils.split(ankenNo, "-");
		if (Objects.nonNull(parts) && parts.length > 0) {
			return parts[0];
		}
		return StringUtils.defaultIfBlank(defaultTargetCustomer, ankenNo);
	}
}
