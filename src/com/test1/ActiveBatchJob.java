package com.test1;

public class ActiveBatchJob {
	private Integer batchJobId;
	private String batchJobName;
	private String batchJobScript;
	private String batchJobStartTime;
	private String batchJobEndTime;
	private String batchJobOwner;
	private boolean autoRun;
	private String manualRunIndicator;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ActiveBatchJob() {

	}

	public ActiveBatchJob(Integer batchJobId, String batchJobName, String batchJobScript, String batchJobStartTime,
			String batchJobEndTime, String batchJobOwner, boolean autoRun, String manualRunIndicator,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.batchJobId = batchJobId;
		this.batchJobName = batchJobName;
		this.batchJobScript = batchJobScript;
		this.batchJobStartTime = batchJobStartTime;
		this.batchJobEndTime = batchJobEndTime;
		this.batchJobOwner = batchJobOwner;
		this.autoRun = autoRun;
		this.manualRunIndicator = manualRunIndicator;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getBatchJobId() {
		return batchJobId;
	}

	public void setBatchJobId(Integer batchJobId) {
		this.batchJobId = batchJobId;
	}

	public String getBatchJobName() {
		return batchJobName;
	}

	public void setBatchJobName(String batchJobName) {
		this.batchJobName = batchJobName;
	}

	public String getBatchJobScript() {
		return batchJobScript;
	}

	public void setBatchJobScript(String batchJobScript) {
		this.batchJobScript = batchJobScript;
	}

	public String getBatchJobStartTime() {
		return batchJobStartTime;
	}

	public void setBatchJobStartTime(String batchJobStartTime) {
		this.batchJobStartTime = batchJobStartTime;
	}

	public String getBatchJobEndTime() {
		return batchJobEndTime;
	}

	public void setBatchJobEndTime(String batchJobEndTime) {
		this.batchJobEndTime = batchJobEndTime;
	}

	public String getBatchJobOwner() {
		return batchJobOwner;
	}

	public void setBatchJobOwner(String batchJobOwner) {
		this.batchJobOwner = batchJobOwner;
	}

	public boolean isAutoRun() {
		return autoRun;
	}

	public void setAutoRun(boolean autoRun) {
		this.autoRun = autoRun;
	}

	public String getManualRunIndicator() {
		return manualRunIndicator;
	}

	public void setManualRunIndicator(String manualRunIndicator) {
		this.manualRunIndicator = manualRunIndicator;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
