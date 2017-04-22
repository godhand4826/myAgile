package source;

public class NoSuchIDException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
	 * the message will be set at the constructor
	 */
	public NoSuchIDException() {
		super("ID¿ù¤F!");
	}
}
