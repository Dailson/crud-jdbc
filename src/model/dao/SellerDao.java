/**
 * 
 */
package model.dao;

import java.util.List;

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
	 * @return
	 */
	public Seller findById(Integer id);
	
	/**
	 * @return
	 */
	public List<Seller> findAll();
}
