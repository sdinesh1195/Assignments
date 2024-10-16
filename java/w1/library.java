package w1;

public class library {
	public static void lib(String bookTitle) {
	System.out.println("Book Added Successfully");
	return;
	}
	
	public static void issueBook() {
		System.out.println("Book issued successfully");
	}
	
public static void main(String[] args) {
	library book = new library();
	book.lib("got");
	book.issueBook();
}


}
