package w2d1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver bt = new ChromeDriver();
		bt.manage().window().maximize();
		bt.get("https://leafground.com/button.xhtml");
		bt.findElement(By.xpath("//span[text()=\"Click\"]")).click();
		String s = bt.getTitle();
		System.out.println(s);
		//String title=s;
		if (s.intern() =="Dashboard".intern()) {
		System.out.println(false);
		} else {
		System.out.println(true);
		}
//		bt.close();
		
		ChromeDriver bt1 = new ChromeDriver();
		bt1.manage().window().maximize();
		bt1.get("https://leafground.com/button.xhtml");
		WebElement verify = bt1.findElement(By.xpath("//span[text()=\"Disabled\"]"));
		boolean verify1 = verify.isSelected();
		System.out.println(verify1);
		String verify2 = verify.getText();
		if (verify1  ) {
			System.out.println(verify2 + " " +"button is enabled");
		} else {
		System.out.println(verify2 + " " +"button is disabled");
		}
		
	//  find and print button submit position
		WebElement loc = bt1.findElement(By.xpath("(//span[text()=\"Submit\"])[1]"));
		Point l=loc.getLocation();
		System.out.println("The location of submit button is"+" "+l);

	//  find and print bg color of submit button with text Find the Save button color
		WebElement col = bt1.findElement(By.xpath("//span[text()=\"Save\"]"));
		String p=col.getText();
		String c=col.getCssValue("background-color");
		System.out.println("Background color of"+ " " +p +"button is" +" "+c);
		
	//  Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement size = bt1.findElement(By.xpath("(//span[text()=\"Submit\"])[2]"));
		Dimension h=size.getSize();
		System.out.println("The width and height of the submit button is"+ " "+h);
//		bt1.close();
		

	}

}
