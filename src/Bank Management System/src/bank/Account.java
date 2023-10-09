package bank;

public class Account {
	
	public static String bankName ="TKA Bank";
	public static String ifscCode = "TKA3333";
	public static String bankAddress="Karvenagar, pune";
	public static String bankcontactNumber="9595 24 3333";
	
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private String contactNumber;
	private String adharNumber;
	private String panNumber;
	
	public Account (String accountHolderName,String accountNumber, double balance,
			String contactNumber, String adharNumber, String panNumber) {
		
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		if (balance>=500) {
			this.balance=balance;
		}else {
			this.balance=500;
		}
		this.contactNumber=contactNumber;
		this.adharNumber=adharNumber;
		this.panNumber=panNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
		
    public double checkBalance() {
    	return this.balance;
    }
    
    public void deposit (double amount) {
    	if (amount > 0) {
    		this.balance= this.balance+ amount;
    	}
    }
    
    public void withdraw(double amount) {
    	
    	if(amount <this.balance&& amount>0) {
    		this.balance= this.balance-amount;
    	}else {
    		System.out.println("Your balance is low to withdraw amount !!!");
    	}
    }
    
    public void printAccountHolderInformation() {
    	System.out.println("BANK NAME:"+ this.bankName);
    	System.out.println("Account HoldeerName:"+this.accountHolderName);
    	System.out.println("Account Number:"+this.accountNumber);
    	System.out.println("Current Balance:"+this.balance);
    	System.out.println("Adhar Number:"+this.adharNumber);
    	System.out.println("Account HolderName ContactNumber:"+this.contactNumber);
    	System.out.println("Account PAN Number:"+this.panNumber);
    	System.out.println("________________________________________________________");
    }
    
}
    	
    
    
    	
    	
    
	
		
	


