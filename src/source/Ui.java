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

���_prompt �ϥΪ� ID. ����ϥΪ� quit.
check �ϥΪ� ID , 
showWelcomeMsg
    ���_prompt command. ���U�Ccommand����ϥΪ�exit
   showGrade, 
   showRank, 
   updateWeights 
   exit

checkID(ID)
promptCommand()
promptID()
showFinishMsg()
showWelcomeMsg()
UI() �غc�l �غc aGradeSystem
************************************************************************ */


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
	/** ----------------------------------------------------------------------------------------------------------
	UI() �غc�l throws NoSuchIDExceptions, NoSuchCommandExceptions
	-------------------------------------------------------------------------------------------------------------- */

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
	/**-------------------------------------------------------------------------------------------------------------
	checkID (ID) throws NoSuchIDExceptions return Boolean
	parameter: ID   a user ID  ex: 123456789
	time:     O(n)  n is  aGradeSystem �����Z�H��
	-----------------------------------------------------------------------------------------------------------------*/

	public boolean checkId(String id) throws NoSuchIDException {
		return false;
	}

	/**
	 * @throws NoSuchCommandException
	 *             if user input the wrong command prompt all command to console
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
	 * @param id
	 *            expected id show welcome message and id above
	 */
	/**-------------------------------------------------------------------------------------------------------------
	showWelcomeMsg () throws NoSuchCommandExceptions
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
	public void showWelcomeMsg(String id) {
	}
}
