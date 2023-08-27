package interviewQue;

public class palindromSeries {
		public static void main(String[] args) {
			int reminder, sum = 0, temp;
			int n = 143;
			
			temp = n;
			while(n>0) {
				reminder = n % 10;
				sum = (sum*10)+reminder;
				n = n/10;
			}
			if(temp == sum) {
				System.out.println("palindrom Number");
			}else {
				System.out.println("Not a Palindrom Number");
			}
		}
}
