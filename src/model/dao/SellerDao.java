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
	public void insert(Seller obj);
	
	/**
	 * @param obj
	 */
	public void update(Seller obj);
	
	/**
	 * @param id
	 */
	public void deleteById(Integer id);
	
	/**
	 * @param id
	 * @return a Seller
	 */
	public Seller findById(Integer id);
	
	/**
	 * @return list of all Seller
	 */
	public List<Seller> findAll();
	

	public List<Seller> findByDepartment(Department department);
}
