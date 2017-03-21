package source;

import java.util.LinkedList;
import java.util.Scanner;

public class GradeSystem implements IGradeSystem {
	LinkedList<Grade> grades = new LinkedList<Grade>();
	float[] weights = new float[] { 0.1f, 0.1f, 0.1f, 0.3f, 0.4f };

	public GradeSystem(String testFilePath) {// for testing
		Scanner scanner = null;
		try {
			scanner = new Scanner(GradeSystem.class.getResourceAsStream(testFilePath), "utf-8");
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

	public GradeSystem() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(GradeSystem.class.getResourceAsStream("/file/inputFile.txt"), "utf-8");
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

	@Override
	public boolean containsId(String id) {
		return grades.stream().parallel()
				.anyMatch(grade -> grade.getId().equals(id));
	}

	@Override
	public void showGrade(String id) {
		Grade grade = grades.stream().parallel()
				.filter(g -> g.getId().equals(id)).findFirst().get();
		System.out.println(grade.getName() + "成績:lab1:\t\t" + grade.getLab1());
		System.out.println("\tlab2:\t\t" + grade.getLab2());
		System.out.println("\tlab3:\t\t" + grade.getLab3());
		System.out.println("\tmid-term:\t" + grade.getMidTerm());
		System.out.println("\tfinal exam:\t" + grade.getFinalExam());
		System.out.println("\ttotal grade:\t" + grade.getTotalGrade(weights));
	}

	@Override
	public void showRank(String id) {
		Grade grade = grades.stream().parallel()
				.filter(g -> g.getId().equals(id)).findFirst().get();
		long rank = grades
				.stream()
				.parallel()
				.filter(g -> g.getTotalGrade(weights) > grade
						.getTotalGrade(weights)).count() + 1;
		System.out.println(grade.getName() + "排名第" + rank);
	}

	@Override
	public void updateWeight() {
		System.out.println("舊配分");
		System.out.println("\tlab1\t\t" + (int) (weights[0] * 100) + "%");
		System.out.println("\tlab2\t\t" + (int) (weights[1] * 100) + "%");
		System.out.println("\tlab3\t\t" + (int) (weights[2] * 100) + "%");
		System.out.println("\tmid-term\t" + (int) (weights[3] * 100) + "%");
		System.out.println("\tfinal exam\t" + (int) (weights[4] * 100) + "%");
		System.out.println("輸入新配分");
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

		System.out.println("請確認新配分");
		System.out.println("\tlab1\t\t" + (int) newWeights[0] + "%");
		System.out.println("\tlab2\t\t" + (int) newWeights[1] + "%");
		System.out.println("\tlab3\t\t" + (int) newWeights[2] + "%");
		System.out.println("\tmid-term\t" + (int) newWeights[3] + "%");
		System.out.println("\tfinal exam\t" + (int) newWeights[4] + "%");
		System.out.println("以上正確嗎? Y (Yes) 或 N (No)");

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

	@Override
	public Grade getGrade(String id) {
		return grades.stream().parallel().filter(g -> g.getId().equals(id))
				.findFirst().get();
	}
}
