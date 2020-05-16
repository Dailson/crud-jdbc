/**
 * 
 */
package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

/**
 * Program 
 *
 * @author dailson
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "book");
		
		Seller seller = new Seller(1, "Dailson", "dailson@gmail.com",  new Date(), 2000.0, obj);
		
		
		System.out.println(seller);

	}

}
