package com.revature.BloodBankApp;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.revature.bloodbank.dao.BloodBankDAOImpl;
import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;

public class BloodBankDAOImplTest {

	@Test
	public void testAddBloodBankCenter() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllBloodBankCenters() {
		
		boolean flag=false;
		List<BloodBankCenter> blist=new ArrayList<BloodBankCenter>();
		try {
			Connection con=DBUtil.getConnection();
			Statement pst=con.createStatement();
			ResultSet rs=pst.executeQuery("select * from BloodBankCenter");
			
			if(rs.next())
				flag=true;
			} catch (Exception e) {
			
			e.printStackTrace();
		}
		assertTrue(flag);
		
		List<BloodBankCenter> blist1=new ArrayList<BloodBankCenter>();
		BloodBankDAOImpl DAOtest=new BloodBankDAOImpl();
		blist1=DAOtest.getAllBloodBankCenters();
		assertNotNull(blist1);
		
	}

	@Test
	public void testGetBloodBankCentersbyId() {
		//fail("Not yet implemented");
	}

}
