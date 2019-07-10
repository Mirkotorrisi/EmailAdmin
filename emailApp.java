package emailApp;
import java.util.Scanner;

public class emailApp {
	public static void main(String [] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("WELCOME TO EMAIL GENERATOR");
		boolean control = true;
		while(control == true) {
			System.out.print("\n\n1 - CREATE NEW EMAIL \n2 - SET PASSWORD\n3 - SET MB CAPACITY\n4 - EXIT");
			int choice = inp.nextInt();
			if(choice == 1) {
				Email em1 = new Email(getUser.getName(),getUser.getSurname());
				System.out.print(em1.showInfo());
				}
			else if(choice == 2) {
				Email em2 = new Email(getUser.getName(),getUser.getSurname());
				em2.changePassword(getUser.newPassword());
				System.out.print(em2.showInfo());
			}
			else if(choice == 3) {
				Email em3 = new Email(getUser.getName(),getUser.getSurname());
				em3.setMailboxCapacity(getUser.mailboxCapacity());
				System.out.println(em3.showInfo());
			}
			else if(choice == 4) {
				System.out.println("Thank you for using this program. Bye.");
				control = false;
			}
		}

		
	}
}
