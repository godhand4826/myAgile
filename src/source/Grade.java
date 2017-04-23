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

	public Grade(String id, String name, int lab1, int lab2, int lab3,
			int midTerm, int finalExam) {
		this.id = id;
		this.name = name;
		this.lab1 = lab1;
		this.lab2 = lab2;
		this.lab3 = lab3;
		this.midTerm = midTerm;
		this.finalExam = finalExam;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the student's id
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getId () return String	
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public String getId() {
		return id;
	}


	/**
	 * @param id expected id
	 * 	set the student's id
	 */
<<<<<<< HEAD

=======
	/**-------------------------------------------------------------------------------------------------------------
	setId (ID) 	
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public void setId(String id) {
		this.id = id;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the student's name
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getName () return String
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public String getName() {
		return name;
	}

	/**
	 * @param name expected name
	 * 	set the student's name
	 */
<<<<<<< HEAD

=======
	/**-------------------------------------------------------------------------------------------------------------
	containsId (ID)
	parameter: ID   a user ID  ex: 123456789
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public void setName(String name) {
		this.name = name;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the student's lab1 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getLab1 () return int
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public int getLab1() {
		return lab1;
	}


	/**
	 * @param lab1 expected lab1 grade
	 * 	set the student's lab1 grade
	 */
<<<<<<< HEAD

=======
	/**-------------------------------------------------------------------------------------------------------------
	setLab1 (lab1)
	parameter: lab1   a user lab1 grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public void setLab1(int lab1) {
		this.lab1 = lab1;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the student's lab2 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getLab2 () return int
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public int getLab2() {
		return lab2;
	}


	/**
	 * @param lab2 expected lab2 grade
	 * 	set the student's lab2 grade
	 */
<<<<<<< HEAD

=======
	/**-------------------------------------------------------------------------------------------------------------
	setLab2 (lab2)
	parameter: lab2   a user lab2 grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public void setLab2(int lab2) {
		this.lab2 = lab2;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the student's lab3 grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getLab3 () return int
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public int getLab3() {
		return lab3;
	}


	/**
	 * @param lab3 expected lab3 grade
	 * 	set the student's lab3 grade
	 */
<<<<<<< HEAD

=======
	/**-------------------------------------------------------------------------------------------------------------
	setLab3 (lab3)
	parameter: lab3   a user lab3 grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public void setLab3(int lab3) {
		this.lab3 = lab3;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the student's midterm grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getMidTerm () return int
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public int getMidTerm() {
		return midTerm;
	}



	/**
	 * @param midTern expected midTern grade
	 *  set the student's midtern grade
	 */
<<<<<<< HEAD

=======
	/**-------------------------------------------------------------------------------------------------------------
	setMidTern (midTern)
	parameter: midTern   a user Mid Tern grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public void setMidTern(int midTern) {
		this.midTerm = midTern;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the student's finalexam grade
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getFinalExam () return int
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public int getFinalExam() {
		return finalExam;
	}


	/**
	 * @param finalExam expected finalExam grade
	 * 	set the student's finalexam grade
	 */
<<<<<<< HEAD

=======
	/**-------------------------------------------------------------------------------------------------------------
	setFinalExam (finalExam)
	parameter: finalExam   a user final Exam grade  ex: 99
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

<<<<<<< HEAD
=======
	/**
	 * @param weights
	 * 	the weights to each exam
	 * @return total grade calculated with the given weights
	 */
	/**-------------------------------------------------------------------------------------------------------------
	getTotalGrade () return int
	-----------------------------------------------------------------------------------------------------------------*/
>>>>>>> 006ab5a... edited method header and added class header
	public int getTotalGrade(float[] weights) {
		return Math.round(lab1 * weights[0] + lab2 * weights[1] + lab3
				* weights[2] + midTerm * weights[3] + finalExam * weights[4]);
	}

}
