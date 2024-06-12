/**
 *
 */
package com.alxvn.backlog.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 */
public class BacklogProcess {

	private String processCd;
	private String issueType;

	public static BacklogProcess of(final String code, final String issueType) {
		final var rs = new BacklogProcess();
		rs.processCd = code;
		rs.issueType = issueType;
		return rs;
	}

	public final String getProcessCd() {
		return processCd;
	}

	public final void setProcessCd(final String processCd) {
		this.processCd = processCd;
	}

	public final String getIssueType() {
		return issueType;
	}

	public final void setIssueType(final String issueType) {
		this.issueType = issueType;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
