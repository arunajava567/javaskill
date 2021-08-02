package com.revature.bloodbank.controller;

import java.util.List;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.service.BloodBankService;
import com.revature.bloodbank.service.BloodBankServiceImpl;

public class BloodBankController {
	
	BloodBankService bloodBankServiceImpl = new BloodBankServiceImpl();
	
	     // controller method to add Blood bank object 
		 public  void addBloodBankCenter(BloodBankCenter bloodBankCenter ) { //DTO
		   
		  try {
			bloodBankServiceImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   }
		 
		 public List<BloodBankCenter> getAllBloodBankCenters(){
				return bloodBankServiceImpl.getAllBloodBankCenters();
			}
			public BloodBankCenter getBloodBankCentersbyId(Integer id) {
				return bloodBankServiceImpl.getBloodBankCentersbyId(id);
			}
	
		 
		 
	

}
