package interviewQue;

public class fabonacciSe {

	public static void main(String[] args) {
		int a =0, b=1, count = 10;
		System.out.print(a + " " + b);
		for(int i = 2; i < count; i++) {
			int c = a+b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}

//0 1 1 2 3 5 8 13 21 34 