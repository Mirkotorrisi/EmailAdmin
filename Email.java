package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName, lastName, password, department,alternateEmail,email;
	private String companySuffix = ".company.com";
	private int mailBoxCapacity = 500;
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = setRandomPassword(8);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
	}
	private String setDepartment(){
		System.out.print("Enter the department \n 1 for sales \n 2 for development \n 3 for Accounting \n 0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";}
	}
	private String setRandomPassword(int length) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyz0123456789@-!*ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] password = new char[length];
		for( int i = 0; i < length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity(){return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	public String showInfo() {
		return "\nNAME: "+firstName+"\nSURNAME: "+lastName+"\nEMAIL: "+email+"\nPASSWORD: "+password+"\nMAILBOX CAPACITY: "+mailBoxCapacity+"mb\n";
	}
}
		
