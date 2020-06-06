/**
 * 
 */
package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 * DepartmentDaoJdbc
 *
 * @author dailson
 *
 */
public class DepartmentDaoJdbc implements DepartmentDao {

	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;

	public DepartmentDaoJdbc(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department findById(Integer id) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			conn.setAutoCommit(false);

			st = conn.prepareStatement("Select * from department where Id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();

			if (rs.next()) {
				Department dep = instanciateDepartment(rs);
				return dep;
			}

			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by" + e1.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

		return null;
	}

	/**
	 * @param rs
	 * @return Department
	 * @throws SQLException
	 */
	private Department instanciateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("Id"));
		dep.setName(rs.getString("Name"));

		return dep;
	}

	@Override
	public List<Department> findAll() {

		try {

			conn.setAutoCommit(false);
			st = conn.prepareStatement("select * from department");

			rs = st.executeQuery();

			List<Department> list = new ArrayList<>();
			while (rs.next()) {
				Department dep = instanciateDepartment(rs);
				list.add(dep);
			}

			conn.commit();
			return list;
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rollec back! Caused by " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying rolled back! Caused by " + e1.getMessage());
			}

		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
}
