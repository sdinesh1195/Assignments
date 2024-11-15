package w2d1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		ChromeDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get("https://www.leafground.com/radio.xhtml");
		
		br.findElement(By.xpath("(//label[text()=\"Edge\"])[1]")).click();
		br.findElement(By.xpath("(//label[text()=\"Edge\"])[1]")).click();
		
		WebElement sel = br.findElement(By.xpath("(//label[text()=\"Edge\"])[1]"));
		boolean verify = sel.isEnabled();
		String verify1 = sel.getText();
		//System.out.println(verify);
		if (verify==true) {
			System.out.println(verify1 +"button is enabled");
		} else {
			System.out.println(verify1+ "button is disabled");
		}
		
		WebElement sel1 = br.findElement(By.xpath("//label[text()=\"21-40 Years\"]"));
		boolean selected = sel1.isSelected();
		String selected2 = sel1.getText();
		//System.out.println(selected2);
		//System.out.println(selected);
		if (selected==true) {
			System.out.println(selected2 +" " + "Button is enabled by default");
		} else {
			System.out.println(selected2 + " " + "Button is not selected by Default");
		}
		
		WebElement sel2 = br.findElement(By.xpath("(//label[text()=\"Safari\"])[2]"));
		boolean select = sel2.isSelected();
		String select2 = sel2.getText();
		//System.out.println(select2);
		//System.out.println(select);
		if (select==true) {
		System.out.println(select2 + " " + "Button is selected by Default");
	    } else {
		System.out.println(select2 + " " + "Button is not selected by Default");
    	}
		
		br.close();
		
		
		

	}

}
