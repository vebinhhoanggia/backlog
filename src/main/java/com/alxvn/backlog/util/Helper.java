/**
 *
 */
package com.alxvn.backlog.util;

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

	public static String getAnkenNo(final String content) {
		// use for backlog sym
		final var backlogSymPattern = "(SYMPHO-\\d+((\\S*)comment-\\d+)?)";
		final var patternBacklog = Pattern.compile(backlogSymPattern);
		final var matcherSymBacklog = patternBacklog.matcher(content);
		if (matcherSymBacklog.find()) {
			return StringUtils.defaultString(matcherSymBacklog.group(1));
		}
		// use for backlog ifront
		final var backlogifrontPattern = "(IFRONT-\\d+((\\S*)comment-\\d+)?)";
		final var patternIFrontBacklog = Pattern.compile(backlogifrontPattern);
		final var matcherIfrontBacklog = patternIFrontBacklog.matcher(content);
		if (matcherIfrontBacklog.find()) {
			return StringUtils.defaultString(matcherIfrontBacklog.group(1));
		}

		// using redmine
		final var pattern = Pattern.compile("(#?\\d+((\\S*)comment-\\d+)?)");
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
}
