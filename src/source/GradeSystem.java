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

/**
 * *************************************************************************
 * class GradeSystems �x�s a list of student grades.
 * 
 * containsID(ID) //��aGradeSystem���_�t��ID GradeSystems () //�غc�l showGrade(ID)
 * showRank(ID) updateWeights ()
 *****************************************************************************/

public class GradeSystem implements IGradeSystem {
	LinkedList<Grade> grades = new LinkedList<Grade>();
	float[] weights = new float[] { 0.1f, 0.1f, 0.1f, 0.3f, 0.4f };

	/**
	 * @param fileLocation
	 *            data file location in relative
	 */

	public GradeSystem(String testFilePath) {// for testing
		Scanner scanner = null;
		try {
			scanner = new Scanner(
					GradeSystem.class.getResourceAsStream(testFilePath),
					"utf-8");
			while (scanner.hasNextLine()) {
				grades.add(new Grade(scanner.next(), scanner.next(), scanner
						.nextInt(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt(), scanner.nextInt()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------------------- GradeSystem() �غc�l
	 * ------------------
	 * --------------------------------------------------------
	 * ---------------------------------------
	 */

	/**
	 * default constructor
	 */

	/*
	 * scanner s;
	 * 	while(s.hasNext())
	 * 	 grades.add(new GradeObject(s scan student data)
	 *  end while
		
	 */
	public GradeSystem() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(
					GradeSystem.class
							.getResourceAsStream("/file/inputFile.txt"),
					"utf-8");
			while (scanner.hasNextLine()) {
				grades.add(new Grade(scanner.next(), scanner.next(), scanner
						.nextInt(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt(), scanner.nextInt()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();

	}

	/**
	 * @param id
	 *            the student's id
	 * @return if the grades contains the id or not
	 */

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------------------- containsId (ID) return Boolean
	 * parameter: ID a user ID ex: 123456789 time: O(n) n is aGradeSystem �����Z�H��
	 * --
	 * ------------------------------------------------------------------------
	 * ---------------------------------------
	 */

	/*
	 * foreach grade in grades
	 *  if(grade.getId().equals(id))
	 *   return true
	 *  end if
	 *  return false
	 */
	@Override
	public boolean containsId(String id) {
		return grades.stream().parallel()
				.anyMatch(grade -> grade.getId().equals(id));
	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------------------- showGrade (ID) parameter: ID a user
	 * ID ex: 123456789
	 * ----------------------------------------------------------
	 * -------------------------------------------------------
	 */

	/*
	 * foreach grade in grades
	 *  if(grade.getId().equals(id))
	 *   print all grade
	 *   ex:
	 *   ���§ʦ��Z�Glab1�G     81�@
				lab2�G     98�@
				lab3�G     84�@
				mid-term :  90�@
				final exam:  93 
                total grade :  91
        end if
	 */
	@Override
	public void showGrade(String id) {
		Grade grade = grades.stream().parallel()
				.filter(g -> g.getId().equals(id)).findFirst().get();
		System.out.println(grade.getName() + "���Z:lab1:\t\t" + grade.getLab1());
		System.out.println("\tlab2:\t\t" + grade.getLab2());
		System.out.println("\tlab3:\t\t" + grade.getLab3());
		System.out.println("\tmid-term:\t" + grade.getMidTerm());
		System.out.println("\tfinal exam:\t" + grade.getFinalExam());
		System.out.println("\ttotal grade:\t" + grade.getTotalGrade(weights));
	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------------------- showRank (ID) parameter: ID a user
	 * ID ex: 123456789
	 * ----------------------------------------------------------
	 * -------------------------------------------------------
	 */
	/*
	 * grade = grade.sort()
	 * foreach grade in grades
	 *  if(grade.getId().equals(id))
	 *   print position of grade
	 *   ex:
	 *   ���§ʱƦW��22
	 */
	@Override
	public void showRank(String id) {
		Grade grade = grades.stream().parallel()
				.filter(g -> g.getId().equals(id)).findFirst().get();
		long rank = grades
				.stream()
				.parallel()
				.filter(g -> g.getTotalGrade(weights) > grade
						.getTotalGrade(weights)).count() + 1;
		System.out.println(grade.getName() + "�ƦW��" + rank);
	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------------------- updateWeight () let user update the
	 * new weight
	 * ----------------------------------------------------------------
	 * -------------------------------------------------
	 */
	/*
	 * print origin weight
	 * ex:
	 * �°t�� 
               lab1           10%
               lab2           10%
               lab3           10%
               mid-term       30%
               final exam      40%
                        ��J�s�t��
               lab1
       scanner s;
       s.next();
       print lab1 weight user input and next
       ex:
       20%
       lab2
       s.next();
       print lab2 weight user input and next
       ex:
       20%
       lab3
       s.next();
       print lab3 weight user input and next
       ex:
       20%
       mid-term
       print mid-term weight user input and next
       ex:
       20%
       final exam
       print final exam weight user input and new weights and confirm msg
       ex:
       20%
                         �нT�{�s�t��
           lab1           20%
           lab2           20%
           lab3           20%
           mid-term       20%
           final exam      20%
      	�H�W���T��? Y (Yes) �� N (No)
      	confirm=s.next()
		if(confirm==Y)
		 if(sum of weights ==100)
		  save change and return
		else
		 return

	 */
	@Override
	public void updateWeight() {
		System.out.println("�°t��");
		System.out.println("\tlab1\t\t" + (int) (weights[0] * 100) + "%");
		System.out.println("\tlab2\t\t" + (int) (weights[1] * 100) + "%");
		System.out.println("\tlab3\t\t" + (int) (weights[2] * 100) + "%");
		System.out.println("\tmid-term\t" + (int) (weights[3] * 100) + "%");
		System.out.println("\tfinal exam\t" + (int) (weights[4] * 100) + "%");
		System.out.println("��J�s�t��");
		System.out.print("\tlab1\t\t");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		float newWeights[] = new float[weights.length];
		newWeights[0] = scanner.nextInt();
		System.out.print("\tlab2\t\t");
		newWeights[1] = scanner.nextInt();
		System.out.print("\tlab3\t\t");
		newWeights[2] = scanner.nextInt();
		System.out.print("\tmid-term\t");
		newWeights[3] = scanner.nextInt();
		System.out.print("\tfinal exam\t");
		newWeights[4] = scanner.nextInt();

		System.out.println("�нT�{�s�t��");
		System.out.println("\tlab1\t\t" + (int) newWeights[0] + "%");
		System.out.println("\tlab2\t\t" + (int) newWeights[1] + "%");
		System.out.println("\tlab3\t\t" + (int) newWeights[2] + "%");
		System.out.println("\tmid-term\t" + (int) newWeights[3] + "%");
		System.out.println("\tfinal exam\t" + (int) newWeights[4] + "%");
		System.out.println("�H�W���T��? Y (Yes) �� N (No)");

		String check = scanner.next();
		scanner = null;
		if (check.equalsIgnoreCase("Y")) {
			int count = 0;
			for (int i = 0; i < newWeights.length; i++) {
				count += newWeights[i];
			}
			if (count != 100) {
				return;
			}
			for (int i = 0; i < newWeights.length; i++) {
				newWeights[i] = newWeights[i] / 100;
			}
			weights = newWeights;

		} else if (check.equalsIgnoreCase("N")) {
			return;
		} else {
			return;
		}

	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------------------- getGrade (ID) return Grade
	 * parameter: ID a user ID ex: 123456789
	 * ------------------------------------
	 * --------------------------------------
	 * ---------------------------------------
	 */

	/*
	 * foreach grade in grades
	 *  if(grade.getId().equals(id))
	 *   return grade
	 *  end if
	 */
	@Override
	public Grade getGrade(String id) {
		return grades.stream().parallel().filter(g -> g.getId().equals(id))
				.findFirst().get();
	}
}
