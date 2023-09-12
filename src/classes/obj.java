package classes;

class A {
	String name;
	int num ;
	
	public void printobj() {
		System.out.println(this.name);
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.num);
	}
	
}

public class obj{
	public static void main(String args[]) {
		A obj1 = new A();
		obj1.name = "pen";
		obj1.num = 5;
		
		obj1.printobj();
		obj1.info();
	}
}
