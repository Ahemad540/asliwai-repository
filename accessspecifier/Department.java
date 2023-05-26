package accessspecifier;

public class Department extends college{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		college cl = new college();
		System.out.println(cl.noOfStaff); //private variable can not inherit in between classes
		System.out.println(cl.collegeName); // protected variable can inherit in between classes
		System.out.println(cl.directorName);// public variable can inherit in between classes
		System.out.println(cl.pincode);     // default variable can inherit in between classes
		
		Department dp = new Department(); 
		dp.areaOfCollege();		   //private method can not inherit in between classes
		dp.approximateplacement(); //protected method can inherit in between classes
		dp.noOfDept();			   //public method can inherit in between classes
		college.univercityName();  //public static method can inherit in between classes
	}
}
