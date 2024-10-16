package w1;

public class prime {
	public static void main(String[] args) {
		int n=13;
		int count=0;
		
		for (int i= 2; i<=n; i++){
			if (n%2==0) {
				count=1;
				break;
         
			}
			}
		if (count==0) {
			System.out.println("Prime");
			}
		else {
			System.out.println("not a prime");
			
         }
		
		}

}
