package source;

import java.util.Scanner;

/**
 * Represents the user interface, provides several method to interactive with console.
 *
 * Bugs: none known
 * 
 * notice that the ui may throw exception during constructing
 *
 * @author       eric
 * @version      1.0
 */

/** ***********************************************************************
class UI (user interface) 

不斷prompt 使用者 ID. 直到使用者 quit.
check 使用者 ID , 
showWelcomeMsg
    不斷prompt command. 做下列command直到使用者exit
   showGrade, 
   showRank, 
   updateWeights 
   exit

checkID(ID)
promptCommand()
promptID()
showFinishMsg()
showWelcomeMsg()
UI() 建構子 建構 aGradeSystem
************************************************************************ */


public class Ui {
	IGradeSystem gradeSystem;
	String id;
	String cmd;
	Scanner scanner = new Scanner(System.in);

	/**
	 * @param iGradeSystemAdaptor the instance of grade system
	 * 
	 * @throws NoSuchIDException
	 * @throws NoSuchCommandException
	 */


	public Ui(IGradeSystem gradeSystem) {// for testing
		this.gradeSystem = gradeSystem;
	}
	/** ----------------------------------------------------------------------------------------------------------
	UI() 建構子 throws NoSuchIDExceptions, NoSuchCommandExceptions
	-------------------------------------------------------------------------------------------------------------- */


	/**
	 * @param iGradeSystemAdaptor
	 *            the instance of grade system
	 * 

	 * @throws NoSuchIDException
	 * @throws NoSuchCommandException
	 * default constructor
	 */

	public Ui() throws NoSuchIDException, NoSuchCommandException {
		gradeSystem = new GradeSystem();
		try {
			while (true) {
				id = "";
				cmd = "";
				promptId();
				id = scanner.next();
				if (id.equalsIgnoreCase("Q")) {
					break;
				}
				checkId(id);// NoSuchIDException
				showWelcomeMsg(id);
				while (!cmd.equalsIgnoreCase("E")) {
					promptCommand();// NoSuchCommandException
				}
			}
			showFinishMsg();
		} catch (NoSuchIDException e) {
			throw e;
		} catch (NoSuchCommandException e) {
			throw e;
		} finally {
			scanner.close();
		}
	}


	/**
	 * @param id
	 *            expected id of student
	 * @return ? the database contains id above : the database doesn't contains
	 *         id above
	 * @throws NoSuchIDException
	 *             if the database NOT contains that id
	 */

	/**-------------------------------------------------------------------------------------------------------------
	checkID (ID) throws NoSuchIDExceptions return Boolean
	parameter: ID   a user ID  ex: 123456789
	time:     O(n)  n is  aGradeSystem 內全班人數
	-----------------------------------------------------------------------------------------------------------------*/


	public boolean checkId(String id) throws NoSuchIDException {
		if (gradeSystem.containsId(id)) {
			return true;
		} else {
			throw new NoSuchIDException();
		}
	}


	/**
	 * @throws NoSuchCommandException
	 *             if user input the wrong command prompt all command to console
	 */

	/**-------------------------------------------------------------------------------------------------------------
	promptCommand () throws NoSuchCommandExceptions
	-----------------------------------------------------------------------------------------------------------------*/

	public void promptCommand() throws NoSuchCommandException {
		System.out.println("輸入指令\t1) G 顯示成績 (Grade)");
		System.out.println("\t2) R 顯示排名 (Rank)");
		System.out.println("\t3) W 更新配分 (Weight)");
		System.out.println("\t4) E 離開選單 (Exit)");
		cmd = scanner.next();
		if (cmd.equalsIgnoreCase("G")) {
			gradeSystem.showGrade(id);
		} else if (cmd.equalsIgnoreCase("R")) {
			gradeSystem.showRank(id);
		} else if (cmd.equalsIgnoreCase("W")) {
			gradeSystem.updateWeight();
		} else if (cmd.equalsIgnoreCase("E")) {
			// do nothing
		} else {
			throw new NoSuchCommandException();
		}

	}


	/**
	 * prompt user id
	 */

	/**-------------------------------------------------------------------------------------------------------------
	promptId () throws NoSuchCommandExceptions
	-----------------------------------------------------------------------------------------------------------------*/

	public void promptId() {
		System.out.println("輸入ID或Q(結束使用)?");
	}


	/**
	 * show finish message
	 */
	/**-------------------------------------------------------------------------------------------------------------
	showFinishMsg () throws NoSuchCommandExceptions
	-----------------------------------------------------------------------------------------------------------------*/

	public void showFinishMsg() {
		System.out.println("結束了");
	}


	/**
	 * @param id
	 *            expected id show welcome message and id above
	 */

	/**-------------------------------------------------------------------------------------------------------------
	showWelcomeMsg () throws NoSuchCommandExceptions
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/

	public void showWelcomeMsg(String id) {
		System.out.println("Welcome " + gradeSystem.getGrade(id).getName());
	}
}
