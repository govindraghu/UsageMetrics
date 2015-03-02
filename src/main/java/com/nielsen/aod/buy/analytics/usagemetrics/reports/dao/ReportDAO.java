/**
 * 
 */
package com.nielsen.aod.buy.analytics.usagemetrics.reports.dao;

import java.sql.Timestamp;

import com.nielsen.aod.buy.analytics.usagemetrics.reports.model.Report;

/**
 * @author govinds
 *
 */
public interface ReportDAO {
	
	public Report getReportByTimeframe(Timestamp startTime, Timestamp endTime);
	
	public Report getReportByObjectType(Timestamp startTime, Timestamp endTime); 
	
}
