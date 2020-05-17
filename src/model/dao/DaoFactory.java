/**
 * 
 */
package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJdbc;

/**
 * DaoFactory 
 *
 * @author dailson
 *
 */
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJdbc(DB.getConnection());
	}
}
