package source;

public class Main {
	public static void main(String[] args) {
		try {
			new Ui();
		} catch (NoSuchIDException e) {
			System.out.println(e.getMessage());
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
	}
}
