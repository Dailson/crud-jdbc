package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

/**
 * TestGetAll
 *
 * @version 3 de jun de 2020
 * @author dailson
 *
 */
public class TestGetAll {
	public static void main(String[] args) {

		/*Create a connection*/
		Connection conn = null;
		
		/*This statement will receives sql parameter */
		Statement st = null;
		
		/*This resultSet will get result of a query as a table*/
		ResultSet rs = null;

		try {
			conn = DB.getConnection();


			st = conn.createStatement();

			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}
}
