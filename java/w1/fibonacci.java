package w1;


public class fibonacci {
	public static void main(String[] args) {
		//declaring inputs
		int a=0;
		int b=1;
		int x=5;
		System.out.println(a);
		System.out.println(b);
		//for loop to run 5 iterations
		for (int i = 0; i <=x; i++) {
			int c=a+b;
			//
			a=b;
			b=c;
			System.out.println(c);
					
			
			
		}
		
	}
	
	
}

