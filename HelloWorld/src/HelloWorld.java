/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hello ASE2015 - how are you not? :)");
		HelloUser helloUser = new HelloUser("Shivam");
		System.out.println("Please enter your name:" + helloUser.userName);
		helloUser.greetUser("Hello");
	}

}
