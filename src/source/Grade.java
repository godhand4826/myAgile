package source;

/**
 * Data structure of students' grades, contains student's data and his/her grade from lab1 to final exam.
 * Use simple getter/setter to access them.
 *
 * Bugs: none known
 * 
 * 
 * @author       eric
 * @version      1.0
 */

/** **********************************************************************
class Grades Àx¦s ID, name, lab1, lab2, lab3, midTerm, finalExam, and totalGrade

calculateTotalGrade(weights)
Grades () { } //«Øºc¤l
************************************************************************/


public class Grade {

	private String id;
	private String name;
	private int lab1;
	private int lab2;
	private int lab3;
	private int midTerm;
	private int finalExam;

	/**
	 * default constructor
	 */
	public Grade() {
	}

	/**
	 * @param id 
	 * 	the student's id
	 * @param name
	 *  the student's name
	 * @param lab1
	 * 	the student's lab1 grade 
	 * @param lab2
	 * 	the student's lab2 grade
	 * @param lab3
	 * 	the student's lab2 grade
	 * @param midTerm
	 * 	the student's midTern grade
	 * @param finalExam
	 * 	the student's finalExam grade
	 * construct the Grade using given argument to initialize the property
	 */
	public Grade(String id, String name, int lab1, int lab2, int lab3,
			int midTerm, int finalExam) {
	}

	/**
	 * @return the student's id
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getId () return String	
	-----------------------------------------------------------------------------------------------------------------*/
	public String getId() {
		return null;
	}

	/**
	 * @param id expected id
	 * 	set the student's id
	 */
	/**-------------------------------------------------------------------------------------------------------------
	setId (ID) 	
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
	public void setId(String id) {
	}

	/**
	 * @return the student's name
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getName () return String
	-----------------------------------------------------------------------------------------------------------------*/
	public String getName() {
		return null;
	}

	/**
	 * @param name expected name
	 * 	set the student's name
	 */
	/**-------------------------------------------------------------------------------------------------------------
	containsId (ID)
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
	public void setName(String name) {
	}

	/**
	 * @return the student's lab1 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getLab1 () return int
	-----------------------------------------------------------------------------------------------------------------*/
	public int getLab1() {
		return 0;
	}

	/**
	 * @param lab1 expected lab1 grade
	 * 	set the student's lab1 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	setLab1 (lab1)
	parameter: lab1   a user lab1 grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
	public void setLab1(int lab1) {
	}

	/**
	 * @return the student's lab2 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getLab2 () return int
	-----------------------------------------------------------------------------------------------------------------*/
	public int getLab2() {
		return 0;
	}

	/**
	 * @param lab2 expected lab2 grade
	 * 	set the student's lab2 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	setLab2 (lab2)
	parameter: lab2   a user lab2 grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
	public void setLab2(int lab2) {
	}

	/**
	 * @return the student's lab3 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getLab3 () return int
	-----------------------------------------------------------------------------------------------------------------*/
	public int getLab3() {
		return 0;
	}

	/**
	 * @param lab3 expected lab3 grade
	 * 	set the student's lab3 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	setLab3 (lab3)
	parameter: lab3   a user lab3 grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
	public void setLab3(int lab3) {
	}

	/**
	 * @return the student's midterm grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getMidTerm () return int
	-----------------------------------------------------------------------------------------------------------------*/
	public int getMidTerm() {
		return 0;
	}

	/**
	 * @param midTern expected midTern grade
	 *  set the student's midtern grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	setMidTern (midTern)
	parameter: midTern   a user Mid Tern grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
	public void setMidTern(int midTern) {
	}

	/**
	 * @return the student's finalexam grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getFinalExam () return int
	-----------------------------------------------------------------------------------------------------------------*/
	public int getFinalExam() {
		return 0;
	}

	/**
	 * @param finalExam expected finalExam grade
	 * 	set the student's finalexam grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	setFinalExam (finalExam)
	parameter: finalExam   a user final Exam grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
	public void setFinalExam(int finalExam) {
	}

	/**
	 * @param weights
	 * 	the weights to each exam
	 * @return total grade calculated with the given weights
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getTotalGrade () return int
	-----------------------------------------------------------------------------------------------------------------*/
	public int getTotalGrade(float[] weights) {
		return 0;
	}

}
