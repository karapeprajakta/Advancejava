package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Test;


public class TestDaoImpl implements TestDao {
	static Connection con;
	static PreparedStatement seleemp,inserte,updatee,selbyid,delbyid;
	static {
		try {
			con=DBUtil.getMyconnection();
			seleemp=con.prepareStatement("select * from Test" );
			inserte=con.prepareStatement("insert into test values(?,?,?)");
			updatee=con.prepareStatement("update test set name=?,sal=? where id=?");
			selbyid=con.prepareStatement("select * from test where id=?");
			delbyid=con.prepareStatement("delete from test where id=?");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<Test> getAll(){
		List<Test> lst=new ArrayList<>();
		try {
			
			ResultSet rs=seleemp.executeQuery();
			while(rs.next()) {
				Test e=new Test(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				lst.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public void add(Test t) {
		try{
			inserte.setInt(1, t.getId());
			inserte.setString(2,t.getName());
			inserte.setDouble(3,t.getSal());
			inserte.executeUpdate();
			
		}catch(SQLException e)
		{
			e.getMessage();
		}
		
		
	}

	@Override
	public void update(Test t) {
		try {
			updatee.setString(1,t.getName());
			updatee.setDouble(2,t.getSal());
			updatee.setInt(3, t.getId());
			updatee.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Test findbyid(int empid) {
		try {
			selbyid.setInt(1,empid);
			ResultSet rs=selbyid.executeQuery();
			if(rs.next())
			{
				return new Test(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Test removebyid(int id) {
		try {
			delbyid.setInt(1,id);
			delbyid.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	


}
