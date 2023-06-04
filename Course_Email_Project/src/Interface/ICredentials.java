package Interface;

import Model.Employee;

public interface ICredentials {
	
	public String generateEmailAddress(Employee employee, String department);
	public String generatePassword();
	public void ShowCredentials(Employee employee);
}
