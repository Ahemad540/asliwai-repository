package accessspecifier;

public class college {
	private int noOfStaff = 150;
	protected String collegeName = "Cocsit";
	public String directorName = "Patil sir";
	String pincode = "413512";
	
	private void areaOfCollege() {
		System.out.println("2 acres");
	}
	protected void approximateplacement() {
		System.out.println("20 - 30 Students");
	}
	public void noOfDept() {
		System.out.println("10 Dept are here");
	}
	public static void univercityName() {
		System.out.println("STRMUN Nanded");
	}
}
