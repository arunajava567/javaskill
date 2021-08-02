package com.revature.bloodbank.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.revature.bloodbank.dao.BloodBankDAO;
import com.revature.bloodbank.dao.BloodBankDAOImpl;
import com.revature.bloodbank.model.BloodBankCenter;

public class BloodBankServiceImpl implements BloodBankService{
	BloodBankDAO bloodBankDaoImpl=new BloodBankDAOImpl();
	static Logger logger = Logger.getLogger("BloodBankServiceImpl.class");
	
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
		logger.info("in service...add method");
			try {
			bloodBankDaoImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
			
			public List<BloodBankCenter> getAllBloodBankCenters(){
				return bloodBankDaoImpl.getAllBloodBankCenters();
			}
			public BloodBankCenter getBloodBankCentersbyId(Integer id) {
				return bloodBankDaoImpl.getBloodBankCentersbyId(id);
			}
	
}
