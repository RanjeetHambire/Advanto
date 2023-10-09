package bank;

public class Client {

	public static void main(String[] args) {
		
		Account jay= new Account("jay","1112", 500,
				"9595 24 3333", "ADHAR123", "PAN123");
		jay.deposit(5000);
		jay.withdraw(1100);
		jay.printAccountHolderInformation();
		
		Account nayan=new Account("nayam","1114", 700,
				"9595 24 3334", "ADHAR133", "PAN456");
		nayan.deposit(6000);
		nayan.withdraw(100);
		nayan.printAccountHolderInformation();
		
		Account pavan=new Account("pavan", "1113",600,
				"9595 24 3335", "ADHAR134","PAN134");
		pavan.deposit(7000);
		pavan.withdraw(300);
		pavan.printAccountHolderInformation();
		
		Account kiran=new Account("kiran", "1115", 800,
				"9595 24 3336", "ADHAR135", "PAN176");
		kiran.deposit(8000);
		kiran.withdraw(500);
		kiran.printAccountHolderInformation();
		
		Account Pranay = new Account("Pranay", "0023", 3000000, "9172 00 2055", "Adhar2218", "Pan9856");
		Pranay.deposit(10000);
		Pranay.withdraw(300000);
		Pranay.printAccountHolderInformation();
		
	}
}
	


