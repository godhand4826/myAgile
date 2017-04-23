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
	 *             default constructor
	 */
	public Ui() throws NoSuchIDException, NoSuchCommandException {
	}

	/**
	 * @param iGradeSystemAdaptor
	 *            the instance of grade system
	 * 
	 * @throws NoSuchIDException
	 * @throws NoSuchCommandException
	 * 
	 */
	public Ui(IGradeSystem iGradeSystemAdaptor) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 *            expected id of student
	 * @return ? the database contains id above : the database doesn't contains
	 *         id above
	 * @throws NoSuchIDException
	 *             if the database NOT contains that id
	 */
	public boolean checkId(String id) throws NoSuchIDException {
		return false;
	}

	/**
	 * @throws NoSuchCommandException
	 *             if user input the wrong command prompt all command to console
	 */
	public void promptCommand() throws NoSuchCommandException {
	}

	/**
	 * prompt user id
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
	 *            expected id show welcome message and id above
	 */
	public void showWelcomeMsg(String id) {
	}
}
