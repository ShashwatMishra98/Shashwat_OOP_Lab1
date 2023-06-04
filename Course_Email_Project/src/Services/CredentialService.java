package Services;

import Interface.ICredentials;
import Model.Employee;
import java.util.Random;

public class CredentialService implements ICredentials{

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		return employee.getFirstName()+ employee.getLastName()+"@"+department+".gl.co.in";
	}

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		 String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		 String numbers = "0123456789";
		 String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		 String password = "";
		 Random random = new Random();
			 password += String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
			 password += String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
			 password += String.valueOf(smallLetters.charAt(random.nextInt(smallLetters.length())));
			 password += String.valueOf(smallLetters.charAt(random.nextInt(smallLetters.length())));
			 password += String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
			 password += String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
			 password += String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
			 password += String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
		 
		  return password;
	}

	@Override
	public void ShowCredentials(Employee employee) {
		System.out.println("Dear Employee : "+ employee.getFirstName()+" your generated credentials are as follows:");
		System.out.println("Email : "+employee.getEmail());
		System.out.println("Password : "+employee.getPassword());
		
	}

}
