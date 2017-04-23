package source;


public interface IGradeSystem {
	
	/**
	 * @param id
	 * 
	 * @return ? the database contains id above : the database doesn't contains id above
	 * judges whether the database contains id above
	 */
	public boolean containsId(String id);

	/**
	 * @param id
	 * show all grade of a student with id above
	 */
	void showGrade(String id);

	/**
	 * @param id
	 * show rank of a student with id above
	 */
	void showRank(String id);

	/**
	 * update weight
	 */
	void updateWeight();

	/**
	 * @param id
	 * 
	 * @return all grade of a student with id above
	 * get all grade of a student with id above
	 */
	Grade getGrade(String id);

}
