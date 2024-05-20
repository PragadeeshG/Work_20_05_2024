package com.test1;

public class BatchRollOutDates {
	private Integer deployIndicator;
	private String workItemCreationDate;
	private Integer noOWorks;
	private String workItemCompletionDate;
	private String sanityTestStartDate;
	private String sanityTestCompletionDate;
	private String integrationTestStartDate;
	private String integrationTestCompletionDate;
	private String userVerificationStartDate;
	private String userVerificationCompletionDate;
	private String rollOutDate;
	private String dayZeroDate;
	private String authorizationDate;
	private String approvalDate;
	private String status;

	public BatchRollOutDates() {

	}

	public BatchRollOutDates(Integer deployIndicator, String workItemCreationDate, Integer noOWorks,
			String workItemCompletionDate, String sanityTestStartDate, String sanityTestCompletionDate,
			String integrationTestStartDate, String integrationTestCompletionDate, String userVerificationStartDate,
			String userVerificationCompletionDate, String rollOutDate, String dayZeroDate, String authorizationDate,
			String approvalDate, String status) {
		super();
		this.deployIndicator = deployIndicator;
		this.workItemCreationDate = workItemCreationDate;
		this.noOWorks = noOWorks;
		this.workItemCompletionDate = workItemCompletionDate;
		this.sanityTestStartDate = sanityTestStartDate;
		this.sanityTestCompletionDate = sanityTestCompletionDate;
		this.integrationTestStartDate = integrationTestStartDate;
		this.integrationTestCompletionDate = integrationTestCompletionDate;
		this.userVerificationStartDate = userVerificationStartDate;
		this.userVerificationCompletionDate = userVerificationCompletionDate;
		this.rollOutDate = rollOutDate;
		this.dayZeroDate = dayZeroDate;
		this.authorizationDate = authorizationDate;
		this.approvalDate = approvalDate;
		this.status = status;
	}

	public Integer getDeployIndicator() {
		return deployIndicator;
	}

	public void setDeployIndicator(Integer deployIndicator) {
		this.deployIndicator = deployIndicator;
	}

	public String getWorkItemCreationDate() {
		return workItemCreationDate;
	}

	public void setWorkItemCreationDate(String workItemCreationDate) {
		this.workItemCreationDate = workItemCreationDate;
	}

	public Integer getNoOWorks() {
		return noOWorks;
	}

	public void setNoOWorks(Integer noOWorks) {
		this.noOWorks = noOWorks;
	}

	public String getWorkItemCompletionDate() {
		return workItemCompletionDate;
	}

	public void setWorkItemCompletionDate(String workItemCompletionDate) {
		this.workItemCompletionDate = workItemCompletionDate;
	}

	public String getSanityTestStartDate() {
		return sanityTestStartDate;
	}

	public void setSanityTestStartDate(String sanityTestStartDate) {
		this.sanityTestStartDate = sanityTestStartDate;
	}

	public String getSanityTestCompletionDate() {
		return sanityTestCompletionDate;
	}

	public void setSanityTestCompletionDate(String sanityTestCompletionDate) {
		this.sanityTestCompletionDate = sanityTestCompletionDate;
	}

	public String getIntegrationTestStartDate() {
		return integrationTestStartDate;
	}

	public void setIntegrationTestStartDate(String integrationTestStartDate) {
		this.integrationTestStartDate = integrationTestStartDate;
	}

	public String getIntegrationTestCompletionDate() {
		return integrationTestCompletionDate;
	}

	public void setIntegrationTestCompletionDate(String integrationTestCompletionDate) {
		this.integrationTestCompletionDate = integrationTestCompletionDate;
	}

	public String getUserVerificationStartDate() {
		return userVerificationStartDate;
	}

	public void setUserVerificationStartDate(String userVerificationStartDate) {
		this.userVerificationStartDate = userVerificationStartDate;
	}

	public String getUserVerificationCompletionDate() {
		return userVerificationCompletionDate;
	}

	public void setUserVerificationCompletionDate(String userVerificationCompletionDate) {
		this.userVerificationCompletionDate = userVerificationCompletionDate;
	}

	public String getRollOutDate() {
		return rollOutDate;
	}

	public void setRollOutDate(String rollOutDate) {
		this.rollOutDate = rollOutDate;
	}

	public String getDayZeroDate() {
		return dayZeroDate;
	}

	public void setDayZeroDate(String dayZeroDate) {
		this.dayZeroDate = dayZeroDate;
	}

	public String getAuthorizationDate() {
		return authorizationDate;
	}

	public void setAuthorizationDate(String authorizationDate) {
		this.authorizationDate = authorizationDate;
	}

	public String getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
