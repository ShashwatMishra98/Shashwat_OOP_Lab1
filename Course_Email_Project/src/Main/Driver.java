package Main;

import Services.CredentialService;
import Model.Employee;
import java.util.Scanner;

public class Driver {

	private static void displayMenu() {
		System.out.println("Please enter the department from the following::");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
	}
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter First Name : ");          // taking users name instead of a fixed name.
		String fName = scanner.nextLine();
		System.out.println("Enter Last Name:");
		String lName = scanner.nextLine();
		
		
		Employee employee = new Employee(fName,lName);
		displayMenu();
		int option = scanner.nextInt();
		System.out.println(option);
		CredentialService credentialService = new CredentialService();
		String [] departments = {"tech","admin","hr","legal"};
		String emailAddress = credentialService.generateEmailAddress(employee, departments[option-1]);
		String password = credentialService.generatePassword();
		employee.setEmail(emailAddress);
		employee.setPassword(password);
		credentialService.ShowCredentials(employee);
	}

}
