package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

/**
 * TestDelete 
 *
 * @version 3 de jun de 2020
 * @author dailson
 *
 */
public class TestDelete {
	public static void main(String[] args) {
		
		/*Creates a connection*/
		Connection conn = null;
		
		/*This statement will receives sql parameter*/
		PreparedStatement st = null;
		
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("Delete from department where Id = ?");
			
			st.setInt(1, 6);
						
			st.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
		
		
		
	}
}
