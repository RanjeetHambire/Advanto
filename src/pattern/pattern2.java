package pattern;

public class pattern2 {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				if(j==1) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

//1****
//2****
//3****
//4****
//5****