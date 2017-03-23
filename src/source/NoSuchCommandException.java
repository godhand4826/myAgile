package source;

public class NoSuchCommandException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchCommandException() {
		super("Wrong Command!");
	}

}
