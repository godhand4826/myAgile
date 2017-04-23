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
	Scanner scanner = new Scanner(System.in);;

	/**
	 * @throws NoSuchIDException
	 * @throws NoSuchCommandException
	 * default constructor
	 */
	/** ----------------------------------------------------------------------------------------------------------
	UI() 建構子 throws NoSuchIDExceptions, NoSuchCommandExceptions
	-------------------------------------------------------------------------------------------------------------- */

	public Ui() throws NoSuchIDException, NoSuchCommandException {
	}

	/**
	 * @param iGradeSystemAdaptor the instance of grade system
	 * 
	 * @throws NoSuchIDException
	 * @throws NoSuchCommandException
	 * 
	 */
	/** ----------------------------------------------------------------------------------------------------------
	UI() 建構子 throws NoSuchIDExceptions, NoSuchCommandExceptions
	-------------------------------------------------------------------------------------------------------------- */

	public Ui(IGradeSystem iGradeSystemAdaptor) throws NoSuchIDException, NoSuchCommandException{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id expected id of student
	 * @return ? the database contains id above : the database doesn't contains id above
	 * @throws NoSuchIDException if the database NOT contains that id
	 */
	/**-------------------------------------------------------------------------------------------------------------
	checkID (ID) throws NoSuchIDExceptions return Boolean
	parameter: ID   a user ID  ex: 123456789
	time:     O(n)  n is  aGradeSystem 內全班人數
	-----------------------------------------------------------------------------------------------------------------*/

	public boolean checkId(String id) throws NoSuchIDException {
		return false;
	}

	/**
	 * @throws NoSuchCommandException if user input the wrong command
	 * prompt all command to console
	 */
	/**-------------------------------------------------------------------------------------------------------------
	promptCommand () throws NoSuchCommandExceptions
	-----------------------------------------------------------------------------------------------------------------*/
	public void promptCommand() throws NoSuchCommandException {
	}

	/**
	 * prompt user id
	 */
	/**-------------------------------------------------------------------------------------------------------------
	promptId () throws NoSuchCommandExceptions
	-----------------------------------------------------------------------------------------------------------------*/
	public void promptId() {
	}

	/**
	 * show finish message
	 */
	/**-------------------------------------------------------------------------------------------------------------
	showFinishMsg () throws NoSuchCommandExceptions
	-----------------------------------------------------------------------------------------------------------------*/
	public void showFinishMsg() {
	}

	/**
	 * @param id expected id
	 * show welcome message and id above
	 */
	/**-------------------------------------------------------------------------------------------------------------
	showWelcomeMsg () throws NoSuchCommandExceptions
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
	public void showWelcomeMsg(String id) {
	}
}
