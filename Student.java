
class Student {
	
	private int usn;
	private String name;
	
	void readInfo(int num,String sname) {
		usn = num;
		name = sname;
	}
	
	void displayInfo() {
		System.out.println("USN = "+usn);
		System.out.println("NAME = "+name);
	}
}
