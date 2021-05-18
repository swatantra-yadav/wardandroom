package com.wardandroom.service;

import com.wardandroom.entities.WardReport;

public interface IWardReportService {
	
	public boolean createWardReport(WardReport wardreport) ;
	
	public boolean updateWardReport(WardReport wardreport);
	
	public WardReport findById(int id);

}
