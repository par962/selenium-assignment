package Package.org;

public class Students {
public void getstudentinfo(int id) {
	System.out.println("Student ID:"+id);
	
	
}
public void getstudentuinfo(int id,String name) {
	System.out.println("Enrollment ID:"+id+ ","+"Name:"+name );
}
public void getstudentinfo(String email,String phonenumber ) {
	System.out.println("Email:" +email+","+"PhoneNumber:"+phonenumber);
	
}
public static void main(String[] args) {
	Students in=new Students();
	in.getstudentinfo(6);
	in.getstudentuinfo(4, "Parthasaradi.V");
	in.getstudentinfo("saradi.66@gmail.com", "9952613406");
}
}
