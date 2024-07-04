/**
 *
 */
package com.alxvn.backlog.dto;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author KEDD
 *
 */
public class PjjyujiDetail {
	private String id;
	private String name;
	private String mailId;
	private LocalDate targetYmd;
	private String pjCd;
	private String pjCdJp;
	private String pjName;
	private WorkingProcess process;
	private String content;
	private String ankenNo;
	private Integer minute;
	private String targetProject;

	public static class Builder {
		private String id;
		private String name;
		private String mailId;
		private LocalDate targetYmd;
		private String pjCd;
		private String pjCdJp;
		private String pjName;
		private WorkingProcess process;
		private String content;
		private String ankenNo;
		private Integer minute;
		private String targetProject;

		public final Builder setMailId(final String mailId) {
			this.mailId = mailId;
			return this;
		}

		public final Builder setName(final String name) {
			this.name = name;
			return this;
		}

		public final Builder setId(final String id) {
			this.id = id;
			return this;
		}

		public final Builder setTargetYmd(final LocalDate targetYmd) {
			this.targetYmd = targetYmd;
			return this;
		}

		public final Builder setPjCd(final String pjCd) {
			this.pjCd = pjCd;
			return this;
		}

		public final Builder setPjCdJp(final String pjCdJp) {
			this.pjCdJp = pjCdJp;
			return this;
		}

		public final Builder setPjName(final String pjName) {
			this.pjName = pjName;
			return this;
		}

		public final Builder setProcess(final WorkingProcess process) {
			this.process = process;
			return this;
		}

		public final Builder setContent(final String content) {
			this.content = content;
			return this;
		}

		public final Builder setAnkenNo(final String ankenNo) {
			this.ankenNo = ankenNo;
			return this;
		}

		public final Builder setMinute(final Integer minute) {
			this.minute = minute;
			return this;
		}

		public final Builder setTargetProject(final String targetProject) {
			this.targetProject = targetProject;
			return this;
		}

		public PjjyujiDetail build() {
			return new PjjyujiDetail(id, name, mailId, targetYmd, pjCd, pjCdJp, pjName, process, content, ankenNo,
					minute, targetProject);
		}
	}

	private PjjyujiDetail(final String id, final String name, final String mailId, final LocalDate targetYmd,
			final String pjCd, final String pjCdJp, final String pjName, final WorkingProcess process,
			final String content, final String ankenNo, final Integer minute, final String targetProject) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.targetYmd = targetYmd;
		this.pjCd = pjCd;
		this.pjCdJp = pjCdJp;
		this.pjName = pjName;
		this.process = process;
		this.content = content;
		this.ankenNo = ankenNo;
		this.minute = minute;
		this.targetProject = targetProject;
	}

	public final String getId() {
		return id;
	}

	public final void setId(final String id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final String getMailId() {
		return mailId;
	}

	public final void setMailId(final String mailId) {
		this.mailId = mailId;
	}

	public final LocalDate getTargetYmd() {
		return targetYmd;
	}

	public final void setTargetYmd(final LocalDate targetYmd) {
		this.targetYmd = targetYmd;
	}

	public final String getPjCd() {
		return pjCd;
	}

	public final void setPjCd(final String pjCd) {
		this.pjCd = pjCd;
	}

	public final String getPjCdJp() {
		return pjCdJp;
	}

	public final void setPjCdJp(final String pjCdJp) {
		this.pjCdJp = pjCdJp;
	}

	public final String getPjName() {
		return pjName;
	}

	public final void setPjName(final String pjName) {
		this.pjName = pjName;
	}

	public final WorkingProcess getProcess() {
		return process;
	}

	public final void setProcess(final WorkingProcess processCd) {
		process = processCd;
	}

	public final String getContent() {
		return content;
	}

	public final void setContent(final String content) {
		this.content = content;
	}

	public final String getAnkenNo() {
		return ankenNo;
	}

	public final void setAnkenNo(final String ankenNo) {
		this.ankenNo = ankenNo;
	}

	public final Integer getMinute() {
		return minute;
	}

	public final void setMinute(final Integer minute) {
		this.minute = minute;
	}

	public String getTargetProject() {
		return targetProject;
	}

	public void setTargetProject(final String targetProject) {
		this.targetProject = targetProject;
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
