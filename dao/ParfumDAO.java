package ro.emanuel.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ro.emanuel.helper.DBHelper;
import ro.emanuel.pojo.Parfum;

public class ParfumDAO {
	
	public static Parfum getParfumById(int id) throws ClassNotFoundException, SQLException {
		
		Connection con = DBHelper.getConnection();
		
		String q = "SELECT * FROM parfum WHERE id = " + id;
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery(q);
		
		
		boolean exists = rs.next();
		
		if(exists) {
			return new Parfum (rs.getInt("id"), rs.getString("nume"), rs.getDouble("pret"));
		}
		
		return null;
		
	}
	public static ArrayList<Parfum> getAll() throws ClassNotFoundException, SQLException{
		ArrayList<Parfum> result = new ArrayList<Parfum>();
		Connection con = DBHelper.getConnection();
		
		String query = "select * from parfum";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt .executeQuery(query);
		while(rs.next()) {
			Parfum p = new Parfum(rs.getInt("id"), rs.getString("nume"), rs.getDouble("pret"));
			result.add(p);
			
		}
		return result;
	}

}