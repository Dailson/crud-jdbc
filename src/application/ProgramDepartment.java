/**
 * 
 */
package application;

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
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
	}
}
