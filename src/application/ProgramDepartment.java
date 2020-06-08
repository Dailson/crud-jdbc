/**
 * 
 */
package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 * ProgramDepartment
 *
 * @author dailson
 *
 */
public class ProgramDepartment {
	public static void main(String[] args) {
		
		
		
		System.out.println("=== TEST 01: Department findById ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
		
		
		System.out.println("\n=== TEST 02: Department findAll ===");
		List<Department>list = departmentDao.findAll();
		for(Department depOnList : list) {
			System.out.println(depOnList);
		}
		
		System.out.println("\n=== TEST 03: Department insert ===");
		dep = new Department(null, "fruits");
		departmentDao.insert(dep);
		
		
		System.out.println("\n=== TEST 04: Department update ===");
		dep = departmentDao.findById(4);
		dep.setName("Notebook");
		departmentDao.update(dep);
		
		
		System.out.println("\n=== TEST 05: Department Delete ===");
		departmentDao.deleteById(4);
		dep.setName("Notebook");
		System.out.println("Deleted");
		
	}
}
