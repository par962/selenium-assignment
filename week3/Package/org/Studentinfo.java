package Package.org;


public class Studentinfo extends Department{
public void studentname() {
	System.out.println("Student Name: Parthasaradi.v");
}
public void studentid() {
	System.out.println("Student ID: 6");
}
public void studentdepartment() {
	System.out.println("Student Department: ECE");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentinfo get=new Studentinfo();
 get.collegename();
 get.collegecode();
 get.collegeRank();
 get.departmentname();
 get.studentname();
 get.studentid();
 get.studentdepartment();
	}

}
