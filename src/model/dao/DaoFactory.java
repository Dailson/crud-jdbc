/**
 * 
 */
package model.dao;

import model.dao.impl.SellerDaoJdbc;

/**
 * DaoFactory 
 *
 * @author dailson
 *
 */
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJdbc();
	}
}
