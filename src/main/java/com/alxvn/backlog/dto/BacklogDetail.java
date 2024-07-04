/**
 *
 */
package com.alxvn.backlog.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 */
public class BacklogDetail {

	private String key;
	private String ankenNo;
	private String mailId;
	private String pjCdJp;
	private String issueType;
	private String subject;
	private String category;
	private String version;
	private String milestone;
	private String assignee;
	private String parentKey;
	private LocalDate expectedStartDate;
	private LocalDate expectedDueDate;
	private LocalDate actualStartDate;
	private LocalDate actualDueDate;
	private BigDecimal estimatedHours;
	private BigDecimal actualHours;
	private String status;
	private String targetCustomer;
	private String progress;
	private LocalDate expectedDeliveryDate;
	private LocalDate actualDeliveryDate;
	private String bugCategory;
	private String bugOrigin;
	private String bugCreator;
	private String bug3rdTest;
	private String processOfWr;
	private BacklogProcess process;
	private String targetProject;

	public String getKey() {
		return key;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public String getAnkenNo() {
		return ankenNo;
	}

	public void setAnkenNo(final String ankenNo) {
		this.ankenNo = ankenNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(final String mailId) {
		this.mailId = mailId;
	}

	public String getPjCdJp() {
		return pjCdJp;
	}

	public void setPjCdJp(final String pjCdJp) {
		this.pjCdJp = pjCdJp;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(final String issueType) {
		this.issueType = issueType;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(final String version) {
		this.version = version;
	}

	public String getMilestone() {
		return milestone;
	}

	public void setMilestone(final String milestone) {
		this.milestone = milestone;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(final String assignee) {
		this.assignee = assignee;
	}

	public String getParentKey() {
		return parentKey;
	}

	public void setParentKey(final String parentKey) {
		this.parentKey = parentKey;
	}

	public LocalDate getExpectedStartDate() {
		return expectedStartDate;
	}

	public void setExpectedStartDate(final LocalDate expectedStartDate) {
		this.expectedStartDate = expectedStartDate;
	}

	public LocalDate getExpectedDueDate() {
		return expectedDueDate;
	}

	public void setExpectedDueDate(final LocalDate expectedDueDate) {
		this.expectedDueDate = expectedDueDate;
	}

	public LocalDate getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(final LocalDate actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public LocalDate getActualDueDate() {
		return actualDueDate;
	}

	public void setActualDueDate(final LocalDate actualDueDate) {
		this.actualDueDate = actualDueDate;
	}

	public BigDecimal getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(final BigDecimal estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public BigDecimal getActualHours() {
		return actualHours;
	}

	public void setActualHours(final BigDecimal actualHours) {
		this.actualHours = actualHours;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getTargetCustomer() {
		return targetCustomer;
	}

	public void setTargetCustomer(final String targetCustomer) {
		this.targetCustomer = targetCustomer;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(final String progress) {
		this.progress = progress;
	}

	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(final LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public LocalDate getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(final LocalDate actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public String getBugCategory() {
		return bugCategory;
	}

	public void setBugCategory(final String bugCategory) {
		this.bugCategory = bugCategory;
	}

	public String getBugOrigin() {
		return bugOrigin;
	}

	public void setBugOrigin(final String bugOrigin) {
		this.bugOrigin = bugOrigin;
	}

	public String getBugCreator() {
		return bugCreator;
	}

	public void setBugCreator(final String bugCreator) {
		this.bugCreator = bugCreator;
	}

	public String getBug3rdTest() {
		return bug3rdTest;
	}

	public void setBug3rdTest(final String bug3rdTest) {
		this.bug3rdTest = bug3rdTest;
	}

	public String getProcessOfWr() {
		return processOfWr;
	}

	public void setProcessOfWr(final String processOfWr) {
		this.processOfWr = processOfWr;
	}

	public BacklogProcess getProcess() {
		return process;
	}

	public void setProcess(final BacklogProcess process) {
		this.process = process;
	}

	public String getTargetProject() {
		return targetProject;
	}

	public void setTargetProject(final String targetProject) {
		this.targetProject = targetProject;
	}

	public static class Builder {

		private final BacklogDetail backlogDetail;

		public Builder() {
			backlogDetail = new BacklogDetail();
		}

		public final Builder key(final String key) {
			backlogDetail.key = key;
			return this;
		}

		public final Builder ankenNo(final String ankenNo) {
			backlogDetail.ankenNo = ankenNo;
			return this;
		}

		public final Builder mailId(final String mailId) {
			backlogDetail.mailId = mailId;
			return this;
		}

		public final Builder pjCdJp(final String pjCdJp) {
			backlogDetail.pjCdJp = pjCdJp;
			return this;
		}

		public final Builder issueType(final String issueType) {
			backlogDetail.issueType = issueType;
			return this;
		}

		public final Builder subject(final String subject) {
			backlogDetail.subject = subject;
			return this;
		}

		public final Builder category(final String category) {
			backlogDetail.category = category;
			return this;
		}

		public final Builder version(final String version) {
			backlogDetail.version = version;
			return this;
		}

		public final Builder milestone(final String milestone) {
			backlogDetail.milestone = milestone;
			return this;
		}

		public final Builder assignee(final String assignee) {
			backlogDetail.assignee = assignee;
			return this;
		}

		public final Builder parentKey(final String parentKey) {
			backlogDetail.parentKey = parentKey;
			return this;
		}

		public final Builder expectedStartDate(final LocalDate expectedStartDate) {
			backlogDetail.expectedStartDate = expectedStartDate;
			return this;
		}

		public final Builder expectedDueDate(final LocalDate expectedDueDate) {
			backlogDetail.expectedDueDate = expectedDueDate;
			return this;
		}

		public final Builder actualStartDate(final LocalDate actualStartDate) {
			backlogDetail.actualStartDate = actualStartDate;
			return this;
		}

		public final Builder actualDueDate(final LocalDate actualDueDate) {
			backlogDetail.actualDueDate = actualDueDate;
			return this;
		}

		public final Builder estimatedHours(final BigDecimal estimatedHours) {
			backlogDetail.estimatedHours = estimatedHours;
			return this;
		}

		public final Builder actualHours(final BigDecimal actualHours) {
			backlogDetail.actualHours = actualHours;
			return this;
		}

		public final Builder status(final String status) {
			backlogDetail.status = status;
			return this;
		}

		public final Builder targetCustomer(final String targetCustomer) {
			backlogDetail.targetCustomer = targetCustomer;
			return this;
		}

		public final Builder progress(final String progress) {
			backlogDetail.progress = progress;
			return this;
		}

		public final Builder expectedDeliveryDate(final LocalDate expectedDeliveryDate) {
			backlogDetail.expectedDeliveryDate = expectedDeliveryDate;
			return this;
		}

		public final Builder actualDeliveryDate(final LocalDate actualDeliveryDate) {
			backlogDetail.actualDeliveryDate = actualDeliveryDate;
			return this;
		}

		public final Builder bugCategory(final String bugCategory) {
			backlogDetail.bugCategory = bugCategory;
			return this;
		}

		public final Builder bugOrigin(final String bugOrigin) {
			backlogDetail.bugOrigin = bugOrigin;
			return this;
		}

		public final Builder bugCreator(final String bugCreator) {
			backlogDetail.bugCreator = bugCreator;
			return this;
		}

		public final Builder bug3rdTest(final String bug3rdTest) {
			backlogDetail.bug3rdTest = bug3rdTest;
			return this;
		}

		public final Builder processOfWr(final String processOfWr) {
			backlogDetail.processOfWr = processOfWr;
			return this;
		}

		public final Builder process(final BacklogProcess process) {
			backlogDetail.process = process;
			return this;
		}

		public final Builder targetProject(final String targetProject) {
			backlogDetail.targetProject = targetProject;
			return this;
		}

		public BacklogDetail build() {
			return backlogDetail;
		}
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
