package w3;

public class Sub1 extends TestData{
	
	public void enterUsername() {
		System.out.println("please enter the username");
		
	}
	
	public void enterPassword() {
		System.out.println("please enter the password");
		
		
	}
	public static void main(String[] args) {
		Sub1 e = new Sub1();
		e.enterUsername();
		e.enterPassword();
		e.enterCredentials();
		e.navigateToHomePage();
	}

}
