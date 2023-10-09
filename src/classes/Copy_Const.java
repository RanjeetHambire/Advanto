//in java coppy constructir is not there
//but we can copy a object to another object with help of constructor

package classes;

class Student{
	String name;
	int age ;
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	
	Student(){
		
	}
	
	
}

public class Copy_Const {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Ronny";
		s1.age = 21;
		
		Student s2 = new Student(s1);
		s2.info();

	}

}
