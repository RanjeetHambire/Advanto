package classes;

public class std1 {
	
	int rollNo;  // instance variable
	String name;
	
	void insert(int r, String n) { // method
		rollNo = r;
		name = n;
	}
	
	std1(){
		rollNo = 12;
		name = "Ranjeet";
		System.out.println(rollNo + " " + name);
	}
	
	std1(int rollno , String name){ // constructor
		this.rollNo = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollNo + " " + name);
	}

	public static void main(String[] args) {
		std1 s = new std1();
		std1 s1 = new std1(11, "rancho");
		s.insert(21, "Ranjeet");
		s1.insert(11, "rancho");
		s.display();
		s1.display();
	}

}
