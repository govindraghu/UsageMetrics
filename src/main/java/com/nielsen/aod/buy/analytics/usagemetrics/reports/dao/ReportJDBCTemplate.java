/**
 * 
 */
package com.nielsen.aod.buy.analytics.usagemetrics.reports.dao;

import java.sql.Timestamp;

import javax.sql.DataSource;


import com.nielsen.aod.buy.analytics.usagemetrics.reports.model.Report;

/**
 * @author govinds
 *
 */
public class ReportJDBCTemplate implements ReportDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nielsen.aod.buy.analytics.usagemetrics.reports.dao.ReportDAO#getReportByTimeframe
	 * ()
	 */
	public Report getReportByTimeframe(Timestamp startTime, Timestamp endTime) {
		// TODO Auto-generated method stub

		// Get Non-Permanent Jobs

		// Get Favorites

		// Get Permanent Jobs

		// Get Saved Selections

		return null;
	}

	public Report getReportByObjectType(Timestamp startTime, Timestamp endTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
