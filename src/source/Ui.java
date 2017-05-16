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
	UI() �غc�l throws NoSuchIDExceptions, NoSuchCommandExceptions
	-------------------------------------------------------------------------------------------------------------- */


	/**
	 * @param iGradeSystemAdaptor
	 *            the instance of grade system
	 * 

	 * @throws NoSuchIDException
	 * @throws NoSuchCommandException
	 * default constructor
	 */

	/*
	 * 
	 * gradeSystem = new GradeSystem();
	 * try
	 *  while(true)
	 *   id = scanner.next()
	 *   if(id==Q)
	 *    break
	 *   checkId(id)
	 *   showWelcomeMsg(id)
	 *   ex:
	 *   Welcome ���§�
	 *   while(cmd!=E)
	 *    promptCommand()
	 *    ex:
	 *    ��J���O 1) G ��ܦ��Z (Grade) 
	 *    2) R ��ܱƦW (Rank) 
	 *    3) W��s�t�� (Weight) 
	 *    4) E ���}��� (Exit)  
	 *  end while
	 *  showFinishMsg()
	 *  ex:
	 *  �����F
	 *  catch NoSuchIDException
	 *  	throw
	 *  catch NoSuchCommandException
	 *  	throw
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
	time:     O(n)  n is  aGradeSystem �����Z�H��
	-----------------------------------------------------------------------------------------------------------------*/

	/*
	 * if(gradeSystem.containsId(id))
	 *  return true
	 * else
	 *  throw NoSuchIDException 
	 */
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

	/*
	 * print commands
	 * ex:
	 * ��J���O 1) G ��ܦ��Z (Grade) 
	 *    2) R ��ܱƦW (Rank) 
	 *    3) W��s�t�� (Weight) 
	 *    4) E ���}��� (Exit)  
	 * cmd= scanner.next();
	 * if(cmd==G)
	 *  gradeSystem.showGrade(id);
	 * if(cmd==R)
	 *  gradeSystem.showRank(id);
	 * if(cmd==W)
	 *  gradeSystem.updateWeight();
	 * if(cmd==E)
	 *  do nothing
	 * else
	 *  throw NoSuchCommandException()
	 */
	public void promptCommand() throws NoSuchCommandException {
		System.out.println("��J���O\t1) G ��ܦ��Z (Grade)");
		System.out.println("\t2) R ��ܱƦW (Rank)");
		System.out.println("\t3) W ��s�t�� (Weight)");
		System.out.println("\t4) E ���}��� (Exit)");
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

	//print id
		//ex:
		/*��JID��Q(�����ϥ�)?
		 * 
		 */
	public void promptId() {
		System.out.println("��JID��Q(�����ϥ�)?");
	}


	/**
	 * show finish message
	 */
	/**-------------------------------------------------------------------------------------------------------------
	showFinishMsg () throws NoSuchCommandExceptions
	-----------------------------------------------------------------------------------------------------------------*/

	/*
	 * print finish msg
	 * ex:
	 * �����F
	 */
	public void showFinishMsg() {
		System.out.println("�����F");
	}


	/**
	 * @param id
	 *            expected id show welcome message and id above
	 */

	/**-------------------------------------------------------------------------------------------------------------
	showWelcomeMsg () throws NoSuchCommandExceptions
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/

	/*
	 * print welcome msg
	 * ex:
	 * Welcome ���§�
	 */
	public void showWelcomeMsg(String id) {
		System.out.println("Welcome " + gradeSystem.getGrade(id).getName());
	}
}
