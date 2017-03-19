package source;


public interface IGradeSystem {
	public boolean containsId(String id);

	void showGrade(String id);

	void showRank(String id);

	void updateWeight();

	Grade getGrade(String id);

}
