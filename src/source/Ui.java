package source;

import java.util.Scanner;

public class Ui {
	IGradeSystem gradeSystem;
	String id;
	String cmd;
	Scanner scanner = new Scanner(System.in);;

	/**
	 * @throws NoSuchIDException
	 * @throws NoSuchCommandException
	 */
	public Ui() throws NoSuchIDException, NoSuchCommandException {
	}

	/**
	 * @param id
	 * @return true if the gradesystem contains that id 
	 * @throws NoSuchIDException if the gradesystem NOT contains that id
	 */
	public boolean checkId(String id) throws NoSuchIDException {
		return false;
	}

	/**
	 * @throws NoSuchCommandException if user input the wrong command
	 */
	public void promptCommand() throws NoSuchCommandException {
	}

	/**
	 * prompt user input the id
	 */
	public void promptId() {
	}

	/**
	 * show finish message
	 */
	public void showFinishMsg() {
	}

	/**
	 * @param id
	 * show welcome message
	 */
	public void showWelcomeMsg(String id) {
	}
}
