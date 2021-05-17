package com.wardandroom.service;

import com.wardandroom.entities.Ward;

public interface IWardService {
	
	public boolean createWard(Ward ward) ;
	
	public boolean updateWard(Ward ward);
	
	public Ward findById(int id);

}
