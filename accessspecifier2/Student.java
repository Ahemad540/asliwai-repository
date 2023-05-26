package accessspecifier2;

import accessspecifier.Department;
import accessspecifier.college;

public class Student extends college{
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	college cl = new college();
	System.out.println(cl.noOfStaff); //private variable can not inherit in between packages 
	System.out.println(cl.collegeName); // protected variable can not inherit in between packages
	System.out.println(cl.directorName);// public variable can inherit in between packages
	System.out.println(cl.pincode);     // default variable can not inherit in between packages
	
	Department dp = new Department(); 
	dp.areaOfCollege();		   //private method can not inherit in between packages
	dp.approximateplacement(); //protected method can not inherit in between packages
	dp.noOfDept();			   //public method can inherit in between packages
	college.univercityName();  //public static method can inherit in between packages
}
}