/**
 *
 */
package com.alxvn.backlog.util;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * @author KEDD
 *
 */
public class Helper {

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
		if (parts.length > 0) {
			final var defaultAnkenNo = PROJECT_ACCEPT.stream().map(t -> getAnkenNo(t, parts[0]))
					.filter(StringUtils::isNotBlank).findFirst().orElse(StringUtils.EMPTY);
			if (StringUtils.isNotBlank(defaultAnkenNo)) {
				return defaultAnkenNo;
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

	public static String getTargetProject(final String ankenNo, final String defaultTargetCustomer) {
		final var parts = StringUtils.split(ankenNo, "-");
		if (parts.length > 0) {
			return parts[0];
		}
		return StringUtils.defaultIfBlank(defaultTargetCustomer, ankenNo);
	}
}
