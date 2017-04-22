package source;

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

	public String getId() {
		return id;
	}


	/**
	 * @param id expected id
	 * 	set the student's id
	 */

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	/**
	 * @param name expected name
	 * 	set the student's name
	 */

	public void setName(String name) {
		this.name = name;
	}

	public int getLab1() {
		return lab1;
	}


	/**
	 * @param lab1 expected lab1 grade
	 * 	set the student's lab1 grade
	 */

	public void setLab1(int lab1) {
		this.lab1 = lab1;
	}

	public int getLab2() {
		return lab2;
	}


	/**
	 * @param lab2 expected lab2 grade
	 * 	set the student's lab2 grade
	 */

	public void setLab2(int lab2) {
		this.lab2 = lab2;
	}

	public int getLab3() {
		return lab3;
	}


	/**
	 * @param lab3 expected lab3 grade
	 * 	set the student's lab3 grade
	 */

	public void setLab3(int lab3) {
		this.lab3 = lab3;
	}

	public int getMidTerm() {
		return midTerm;
	}



	/**
	 * @param midTern expected midTern grade
	 *  set the student's midtern grade
	 */

	public void setMidTern(int midTern) {
		this.midTerm = midTern;
	}

	public int getFinalExam() {
		return finalExam;
	}


	/**
	 * @param finalExam expected finalExam grade
	 * 	set the student's finalexam grade
	 */

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	public int getTotalGrade(float[] weights) {
		return Math.round(lab1 * weights[0] + lab2 * weights[1] + lab3
				* weights[2] + midTerm * weights[3] + finalExam * weights[4]);
	}

}
