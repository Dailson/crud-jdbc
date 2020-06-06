/**
 * 
 */
package model.dao;

import java.util.List;

import model.entities.Department;

/**
 * DepartmentDao 
 *
 * @author dailson
 *
 */
 public interface DepartmentDao {

	
	/**
	 * @param obj
	 */
	 void insert(Department obj);
	
	/**
	 * @param obj
	 */
	 void update(Department obj);
	
	/**
	 * @param id
	 */
	 void deleteById(Integer id);
	
	/**
	 * @param id
	 * @return a Department
	 */
	 Department findById(Integer id);
	
	/**
	 * @return a list of all Department
	 */
	 List<Department> findAll();
}
