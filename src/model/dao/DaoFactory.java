/**
 * 
 */
package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJdbc;
import model.dao.impl.SellerDaoJdbc;

/**
 * DaoFactory 
 *
 *It responsible for instanciate the DAOs
 * @author dailson
 *
 */
public class DaoFactory {
	
	
	/*Return a type of interface*/
	public static SellerDao createSellerDao() {
		/*Return an implementation*/
		return new SellerDaoJdbc(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJdbc(DB.getConnection());
	}
}
