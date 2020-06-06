/**
 * 
 */
package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;


/**
 * Seller 
 *
 * @author dailson
 *
 */
public interface SellerDao {
	/**
	 * @param obj
	 */
	void insert(Seller obj);
	
	/**
	 * @param obj
	 */
	void update(Seller obj);
	
	/**
	 * @param id
	 */
	void deleteById(Integer id);
	
	/**
	 * @param id
	 * @return a Seller
	 */
	Seller findById(Integer id);
	
	/**
	 * @return list of all Seller
	 */
	List<Seller> findAll();
	

	List<Seller> findByDepartment(Department department);
}
