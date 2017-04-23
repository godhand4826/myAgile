package source;
/**
 * user defined exception
 *
 * Bugs: none known
 * 
 * 
 * @author       eric
 * @version      1.0
 */



public class NoSuchIDException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
	 * the message will be set at the constructor
	 */
	public NoSuchIDException() {
		super("ID¿ù¤F!");
	}
}
