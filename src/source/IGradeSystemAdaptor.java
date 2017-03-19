package source;

public class IGradeSystemAdaptor implements IGradeSystem {

	@Override
	public boolean containsId(String id) {
		return false;
	}

	@Override
	public void showGrade(String id) {
	}

	@Override
	public void showRank(String id) {
	}

	@Override
	public void updateWeight() {
	}

	@Override
	public Grade getGrade(String id) {
		return null;
	}

}
