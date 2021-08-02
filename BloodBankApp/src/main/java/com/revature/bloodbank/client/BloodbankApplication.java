package com.revature.bloodbank.client;


import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.bloodbank.controller.BloodBankController;
import com.revature.bloodbank.model.BloodBankCenter;

//coding std, exception, logger, colleection,jdbc,unit tetsing
//layered 
// corejava, collection,exception, io, lambda-,stream, junit, jdbc, logger

public class BloodbankApplication {

	static Logger logger = Logger.getLogger("BloodbankApplication.class");
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("====BloodBank Application===========");
		
		BloodBankController bcontroller=new BloodBankController();
		
		System.out.println("enter boold bank details");
		
		BloodBankCenter bloodBankCenter=new  BloodBankCenter();//Model   DTO
		
		logger.info("entered in client");
		int centerId=sc.nextInt();sc.nextLine();
		 String centerName=sc.nextLine();;
		 String street=sc.nextLine();;
		 String city=sc.nextLine();;
		 String state=sc.nextLine();;
		 String pincode=sc.nextLine();
		 bloodBankCenter.setCenterId(centerId);
		 bloodBankCenter.setCenterName(centerName);
		 bloodBankCenter.setCity(city);
		 
		 bcontroller.addBloodBankCenter(bloodBankCenter);
		 
		 System.out.println(" Use case 1- Ading Blood bank ceneter is completed.");
		 System.out.println("enter center id");
		 int centerId1=sc.nextInt();
		 System.out.println(bcontroller.getBloodBankCentersbyId(centerId1));
			
		 System.out.println("====display all cneters");
		 
		 System.out.println(bcontroller.getAllBloodBankCenters());
		 
		 List<BloodBankCenter> blist=bcontroller.getAllBloodBankCenters();
		 
		 
		
		
	}
}
