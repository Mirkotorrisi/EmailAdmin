package emailApp;
import java.util.Scanner;
public class getUser {
		public static String getName() {
			Scanner inp = new Scanner(System.in);
			System.out.println("Insert Name: ");
			String firstName = inp.nextLine();
			return firstName;
		}
		public static String getSurname() {
			Scanner inp = new Scanner(System.in);
			System.out.println("Insert Surname: ");
			String lastName = inp.nextLine();
			return lastName;
		}
		public static String newPassword() {
			Scanner inp = new Scanner(System.in);
			System.out.println("Insert new Password: ");
			String newPassword = inp.nextLine();
			return newPassword;
		}
		public static int mailboxCapacity() {
			Scanner inp = new Scanner(System.in);
			System.out.println("Insert new capacity: ");
			int cap = inp.nextInt();
			return cap;
		}
	}

