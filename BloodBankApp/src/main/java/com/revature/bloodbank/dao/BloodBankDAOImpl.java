package com.revature.bloodbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;


public class BloodBankDAOImpl  implements BloodBankDAO{
	//insert 
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
		
		try {
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into BloodBankCenter values(?,?,?,?,?,?)");
			pst.setInt(1, bloodBankCenter.getCenterId());
			pst.setString(2, bloodBankCenter.getCenterName());
			pst.setString(3, bloodBankCenter.getStreet());
			pst.setString(4, bloodBankCenter.getCity());
			pst.setString(5, bloodBankCenter.getState());
			pst.setString(6, bloodBankCenter.getPincode());
			pst.execute();
			System.out.println("data inserted..");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	    //delete
		
		//update
		//read or select 
		public List<BloodBankCenter>  getAllBloodBankCenters() {
			List<BloodBankCenter> blist=new ArrayList<BloodBankCenter>();
			try {
				Connection con=DBUtil.getConnection();
				Statement pst=con.createStatement();
				ResultSet rs=pst.executeQuery("select * from BloodBankCenter");
				while(rs.next()) {
					BloodBankCenter b=new BloodBankCenter();
					b.setCenterId(rs.getInt(1));
					b.setCenterName(rs.getString(2));
					b.setState(rs.getString(3));
					b.setStreet(rs.getString(4));
					b.setCity(rs.getString(5));
					b.setPincode(rs.getString(6));
					blist.add(b);
				}
				
			
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return blist;
		}
		
		public BloodBankCenter getBloodBankCentersbyId(Integer id) {
			BloodBankCenter b=new BloodBankCenter();
			try {
				Connection con=DBUtil.getConnection();
				PreparedStatement pst=con.prepareStatement("select * from BloodBankCenter where centerId=?");
				pst.setInt(1,id);
				
				ResultSet rs=pst.executeQuery();
				
				while(rs.next()) {
					
					b.setCenterId(rs.getInt(1));
					b.setCenterName(rs.getString(2));
					b.setState(rs.getString(3));
					b.setStreet(rs.getString(4));
					b.setCity(rs.getString(5));
					b.setPincode(rs.getString(6));
					
				}
				
			
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return b;
		}
		
	
}
