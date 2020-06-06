package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

/**
 * TestUpdate
 *
 * @version 3 de jun de 2020
 * @author dailson
 *
 */
public class TestUpdate {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			conn.setAutoCommit(false);

			st = conn.prepareStatement("update department set Name = ? WHERE Id = ?", Statement.RETURN_GENERATED_KEYS);

			st.setString(1, "Foods");
			st.setInt(2, 4);

			int rowsAffectd = st.executeUpdate();

			if (rowsAffectd > 0) {

				ResultSet rs = st.getGeneratedKeys();

				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id: " + id);
				}

			} else {
				System.out.println("No rows affected!");
			}

			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}
}
