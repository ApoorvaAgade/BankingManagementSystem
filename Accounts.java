package BankManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Accounts {

	private Scanner scanner; 
	private Connection connection;

	public Accounts(Connection connection, Scanner scanner) {
		// TODO Auto-generated constructor stub
		this.scanner=scanner;
		this.connection=connection;
	}
	public long open_account(String email) {
		System.out.println("Enter Full Name:");
		String full_name=scanner.nextLine();
		System.out.print("Enter Initial Amount: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Security Pin: ");
        String security_pin = scanner.nextLine();
		return 0;	
	}
	public long getAccount_number(String email) {
		return 0;
	}
	private long generateAccountNumber() {
		return 0;
		
	}
	public boolean account_exist(String email) {
		return false;
		
	}
	public void credit_money() {
		 System.out.print("Enter Amount: ");
	     double amount = scanner.nextDouble();
	     scanner.nextLine();
	     System.out.print("Enter Security Pin: ");
	     String security_pin = scanner.nextLine();
	 }
	public void debit_money(long account_number) {
		System.out.print("Enter Amount: ");
       double amount = scanner.nextDouble();
       scanner.nextLine();
       System.out.print("Enter Security Pin: ");
       String security_pin = scanner.nextLine();
	}
	public void transfer_money(long sender_account_number){
       scanner.nextLine();
       System.out.print("Enter Receiver Account Number: ");
       long receiver_account_number = scanner.nextLong();
       System.out.print("Enter Amount: ");
       double amount = scanner.nextDouble();
       scanner.nextLine();  
       System.out.print("Enter Security Pin: ");
       String security_pin = scanner.nextLine();
}
	public void getBalance(long account_number){
       scanner.nextLine();
       System.out.print("Enter Security Pin: ");
       String security_pin = scanner.nextLine();
}
	
	}


