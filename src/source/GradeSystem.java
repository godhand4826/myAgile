package source;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Grade system itself, provides methods that correspond to each user action.
 *
 * Bugs: none known
 * 
 * 
 * @author       vivi00790
 * @version      1.0
 */

/** *************************************************************************
class GradeSystems 儲存 a list of student grades.

containsID(ID)  //看aGradeSystem有否含此ID
GradeSystems () //建構子
showGrade(ID)
showRank(ID)
updateWeights ()   
*****************************************************************************/


public class GradeSystem implements IGradeSystem {
	LinkedList<Grade> grades = new LinkedList<Grade>();
	float[] weights = new float[] { 0.1f, 0.1f, 0.1f, 0.3f, 0.4f };

	/**
	 * default constructor
	 */
	/**-------------------------------------------------------------------------------------------------------------
	GradeSystem() 建構子
	-----------------------------------------------------------------------------------------------------------------*/
	public GradeSystem() {
	}

	/**
	 * @param fileLocation data file location in relative 
	 */
	/**-------------------------------------------------------------------------------------------------------------
	GradeSystem() 建構子
	-----------------------------------------------------------------------------------------------------------------*/
	public GradeSystem(String fileLocation) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * 	the student's id
	 * @return if the grades contains the id or not
	 */
	/**-------------------------------------------------------------------------------------------------------------
	containsId (ID) return Boolean
	parameter: ID   a user ID  ex: 123456789
	time:     O(n)  n is  aGradeSystem 內全班人數
	-----------------------------------------------------------------------------------------------------------------*/
	@Override
	public boolean containsId(String id) {
		return false;
	}

	/**
	 * @param id
	 * 	the student's id
	 * print the student's grade to console
	 */
	/**-------------------------------------------------------------------------------------------------------------
	showGrade (ID) 
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
	@Override
	public void showGrade(String id) {
	}

	/**
	 * @param id
	 * 	the student's id
	 * print the student's rank
	 */
	/**-------------------------------------------------------------------------------------------------------------
	showRank (ID) 
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
	@Override
	public void showRank(String id) {
	}

	/**
	 * let user update the new weight
	 */
	/**-------------------------------------------------------------------------------------------------------------
	updateWeight ()  let user update the new weight
	-----------------------------------------------------------------------------------------------------------------*/
	@Override
	public void updateWeight() {
	}

	/**
	 * @param id expected student id
	 * @return the grade of the student
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getGrade (ID)  return Grade
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
	@Override
	public Grade getGrade(String id) {
		return null;
	}
}
