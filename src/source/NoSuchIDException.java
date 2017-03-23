package source;

public class NoSuchIDException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchIDException() {
		super("Wrong ID!");
	}
}
