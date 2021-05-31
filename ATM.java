package github;
import java.util.Scanner;
public class ATM {
	
	static {
		System.out.println("Welcome to SBI");}
	public static void main(String[] args) {
		UI u = new UI();
		for(int i=0;;) {
		u.trans();}}}

class UI{
	Scanner sc = new Scanner(System.in);
	transaction_ tr = new transaction_();
	customer_ cs = new customer_();
	
	public void trans() {
		
		System.out.println("\nEnter\n"
				+ "1 for balance check\n"
				+ "2 for balance transaction\n"
				+ "3 for customer details\n"
				+"0 to exist");
		
		byte choice=sc.nextByte();
		
		switch(choice) {
		case 1:
			tr.bal_check();
			break;
			
		case 2:
			tr.func();
			break;
			
		case 3:
			cs.cus();
			break;
			
		case 0: System.exit(0);
		break;
		
		default:
				System.out.println("You gave a wrong input\n");
			}
		}
}

class transaction_{
	int balance,amount;
	Scanner sc = new Scanner(System.in);
	
	public void bal_check() {
		System.out.println("Your current balance is "+balance);}
	
	public void dep() {
		System.out.println("Enter the amount you want to deposit");
		amount=sc.nextInt();
		balance=balance+amount;
		bal_check();}
	
	public void wit() {
		System.out.println("Enter the amount you want to withdraw");
		amount=sc.nextInt();
		
		if(amount<=balance) {
		balance=balance-amount;
		bal_check();}
		
		else {
			System.out.println("You don't have sufficient balance");
			bal_check();}}
	
	public void func() {
		System.out.println("Enter\nD for deposit\nW for withdraw");
		String input=sc.next();

		switch(input)
		{
		case "d":{
			dep();
			break;}
		
		case "w": {
			wit();
			break;}
		default: System.out.println("Give a valid input");
		}
		}
	}

class customer_{
	
	private double account_number=457457855;
	private String name="SBI customer";
	private double contact;
	private String branch="Hitech city-Hyderabad";
	private String DOO="12/12/2012";
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return this.name;}
	
	public double getAccount() {
		return account_number;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public String getdoo() {
		return DOO;
	}
	
	public void setCont(double con) {
		contact=con;
	}
	
	public double getCont() {
		return contact;
	}
	
	public void show() {
		System.out.println("\nName- "+getName());
		System.out.println("Account number- "+getAccount());
		System.out.println("Contact number- "+getCont());
		System.out.println("Branch- "+getBranch());
		System.out.println("Date of opening- "+getdoo());
	}
	public void change() {
		System.out.println("Enter new contact number");
		double con=sc.nextDouble();
		setCont(con);
		System.out.println("Phone number changed to "+getCont());
	}
	
	public void cus() {
		System.out.println("\nPress\n1 to show details\n2 to change details");
		
		int god=sc.nextInt();
		
		switch(god)
		{
		case 1:
			show();
			break;
	
		case 2:
			System.out.println("\nPress\n1 to change phone number\nFor other changes please"
					+ " visit your branch");
			int i=sc.nextInt();
			if(i==1) {
			change();}
			else System.out.println("Invalid input");
			break;
			
		default:
			System.out.println("Please give a valid input");
		}
	}
}