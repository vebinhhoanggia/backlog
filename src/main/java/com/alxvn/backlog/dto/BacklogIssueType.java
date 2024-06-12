/**
 *
 */
package com.alxvn.backlog.dto;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author KEDD
 *
 */
public enum BacklogIssueType implements EnumCodeable {
	P_1("機能開発") //
	, P_2("マージ(委託)") //
	, P_3("調査(委託)") //
	, P_4("課題(委託)") //
	, P_5("バグ") //
	, P_6("工数積算") //
	, P_7("課題(社内)") //
	, P_8("開発") //
	, P_9("マージ") //
	, P_10("Q&A") //
	, P_11("課題内容の作成") //
	, P_12("環境構築") //
	, P_13("調査") //
	, P_14("案件に関する学習") //
	, P_15("既存の業務を把握") //
	, P_16("発生問題の連絡・報告") //
	, P_17("開発へのサポート") //
	, P_18("Q&Aレビュー") //
	, P_19("環境構築に関わるサポート") //
	, P_20("技術に関わるサポート") //
	, P_21("機能業務に関わるサポート") //
	, P_22("委託元サポート") //
	, P_23("第三者検証") //
	, P_24("第三者検証(マージ)") //
	, P_25("タスク") //
	, P_26("元バグのメモ") //
	, P_27("その他") //
	/* */
	;

	private static final Map<String, BacklogIssueType> stringToEnum;

	static {
		final Map<String, BacklogIssueType> m = new ConcurrentHashMap<>();
		for (final BacklogIssueType entry : BacklogIssueType.values()) {
			m.put(entry.code, entry);
		}
		stringToEnum = Collections.unmodifiableMap(m);
	}

	public static BacklogIssueType fromString(final String s) {
		return stringToEnum.get(s);
	}

	private final String code;

	BacklogIssueType(final String code) {
		this.code = code;
	}

	@JsonValue
	@Override
	public String getCode() {
		return code;
	}

}
