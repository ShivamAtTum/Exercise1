
public class HelloUser {

	// Variable
	public String userName;
	
	// Constructor
	public HelloUser (String userName){
		this.userName = userName;
	}
	
	// Method
	public void greetUser(String greeting){
		System.out.println(greeting + userName + "!");
	}
	
}
