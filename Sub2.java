package w3;

public class Sub2 extends TestData{
	
	public void username2(String a) {
		System.out.println(a);
		
	}
	public void password2(String b) {
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.password2("123");
		s.username2("calix");
		s.enterCredentials();
		s.navigateToHomePage();
	}

}
