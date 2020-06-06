/**
 * 
 */
package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 * Program
 *
 * @author dailson
 *
 */
public class ProgramSeller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 01: Seller findById ===");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);

		/*
		System.out.println("\n=== TEST 02: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list1 = sellerDao.findByDepartment(department);
		for (Seller obj1 : list1) {
			System.out.println(obj1);
		}

		
		System.out.println("\n=== TEST 03: Seller findAll ===");
		list1 = sellerDao.findAll();
		for (Seller obj2 : list1) {
			System.out.println(obj2);
		}

		
		System.out.println("\n=== TEST 04: Seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id :" + newSeller.getId());

		
		System.out.println("\n=== TEST 05: Seller update ===");
		seller = sellerDao.findById(2);
		seller.setName("Gomes");
		sellerDao.update(seller);
		System.out.println("Updated completed!");

		
		System.out.println("\n=== TEST 06: Seller Delete ===");
		sellerDao.deleteById(17);
		System.out.println("Deleted!");
*/
	}

}
