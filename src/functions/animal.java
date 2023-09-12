package functions;

class dog{
	String name;
	int age;
	
	dog(String name, int age){
		this.name = name;
		this.age =age;
	}
	
	public void bark() {
		System.out.println("bhu bhu");
	}
	
	public void sleep() {
		System.out.println("Zzzzz Zzzzz");
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class animal {

	public static void main(String[] args) {
		dog dog1 = new dog("rom", 5);
		dog dog2 = new dog("romy", 5);
		dog dog3 = new dog("raja", 5);
		dog dog4 = new dog("Luci", 5);
		dog dog5 = new dog("Manu", 5);
		dog1.info();
		dog2.info();
		dog3.info();
		dog4.info();
		dog5.info();
		
	}

}
