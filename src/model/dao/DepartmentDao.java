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
	public void insert(Department obj);
	
	/**
	 * @param obj
	 */
	public void update(Department obj);
	
	/**
	 * @param id
	 */
	public void deleteById(Integer id);
	
	/**
	 * @param id
	 * @return
	 */
	public Department findById(Integer id);
	
	/**
	 * @return
	 */
	public List<Department> findAll();
}
