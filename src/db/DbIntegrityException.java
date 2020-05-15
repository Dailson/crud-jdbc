/**
 * 
 */
package db;

/**
 * DbIntegretyException 
 *
 * @author dailson
 *
 */
public class DbIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
