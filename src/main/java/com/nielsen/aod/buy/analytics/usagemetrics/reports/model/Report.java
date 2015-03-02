/**
 * 
 */
package com.nielsen.aod.buy.analytics.usagemetrics.reports.model;

import java.sql.Timestamp;

/**
 * @author govinds
 *
 */
public class Report {

	private String objectType;
	
	private Timestamp timestamp;
	
	private String jobId;
	
	private String portfolioId;
	
	private String portfolioName;
	
	private String datascopeName;
	
	private String categoryId;
	
	private String datascopeId;
	
	private String portfolioItemId;
	
	private String portfolioItemName;
	
	private Timestamp startTime;
	
	private Timestamp endTime;
	
	private String requestInstanceId;
	
	private String builderRequestInstanceId;
	
	private String reportSpecId;
	
	private String reportType;

	/**
	 * @return the objectType
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * @param objectType the objectType to set
	 */
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return jobId;
	}

	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * @return the portfolioId
	 */
	public String getPortfolioId() {
		return portfolioId;
	}

	/**
	 * @param portfolioId the portfolioId to set
	 */
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	/**
	 * @return the portfolioName
	 */
	public String getPortfolioName() {
		return portfolioName;
	}

	/**
	 * @param portfolioName the portfolioName to set
	 */
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	/**
	 * @return the datascopeName
	 */
	public String getDatascopeName() {
		return datascopeName;
	}

	/**
	 * @param datascopeName the datascopeName to set
	 */
	public void setDatascopeName(String datascopeName) {
		this.datascopeName = datascopeName;
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the datascopeId
	 */
	public String getDatascopeId() {
		return datascopeId;
	}

	/**
	 * @param datascopeId the datascopeId to set
	 */
	public void setDatascopeId(String datascopeId) {
		this.datascopeId = datascopeId;
	}

	/**
	 * @return the portfolioItemId
	 */
	public String getPortfolioItemId() {
		return portfolioItemId;
	}

	/**
	 * @param portfolioItemId the portfolioItemId to set
	 */
	public void setPortfolioItemId(String portfolioItemId) {
		this.portfolioItemId = portfolioItemId;
	}

	/**
	 * @return the portfolioItemName
	 */
	public String getPortfolioItemName() {
		return portfolioItemName;
	}

	/**
	 * @param portfolioItemName the portfolioItemName to set
	 */
	public void setPortfolioItemName(String portfolioItemName) {
		this.portfolioItemName = portfolioItemName;
	}

	/**
	 * @return the startTime
	 */
	public Timestamp getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Timestamp getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the requestInstanceId
	 */
	public String getRequestInstanceId() {
		return requestInstanceId;
	}

	/**
	 * @param requestInstanceId the requestInstanceId to set
	 */
	public void setRequestInstanceId(String requestInstanceId) {
		this.requestInstanceId = requestInstanceId;
	}

	/**
	 * @return the builderRequestInstanceId
	 */
	public String getBuilderRequestInstanceId() {
		return builderRequestInstanceId;
	}

	/**
	 * @param builderRequestInstanceId the builderRequestInstanceId to set
	 */
	public void setBuilderRequestInstanceId(String builderRequestInstanceId) {
		this.builderRequestInstanceId = builderRequestInstanceId;
	}

	/**
	 * @return the reportSpecId
	 */
	public String getReportSpecId() {
		return reportSpecId;
	}

	/**
	 * @param reportSpecId the reportSpecId to set
	 */
	public void setReportSpecId(String reportSpecId) {
		this.reportSpecId = reportSpecId;
	}

	/**
	 * @return the reportType
	 */
	public String getReportType() {
		return reportType;
	}

	/**
	 * @param reportType the reportType to set
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	
}

