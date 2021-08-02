package com.revature.bloodbank.dao;

import java.util.List;

import com.revature.bloodbank.model.BloodBankCenter;

public interface BloodBankDAO {
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter);
	public List<BloodBankCenter> getAllBloodBankCenters();
	public BloodBankCenter getBloodBankCentersbyId(Integer id);
	
}
