package com.revature.bloodbank.service;

import java.util.List;

import com.revature.bloodbank.model.BloodBankCenter;

public interface BloodBankService {
	
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter);
	public List<BloodBankCenter> getAllBloodBankCenters();
	public BloodBankCenter getBloodBankCentersbyId(Integer id);

}
