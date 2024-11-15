package w2d1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
        ChromeDriver task21 = new ChromeDriver();
		
		task21.get("https://leafground.com/checkbox.xhtml");
		task21.manage().window().maximize();
		
		
		task21.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[1]")).click();
		task21.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		//task21.switchTo();
		WebElement ver = task21.findElement(By.xpath("(//div[@class='ui-growl ui-widget'])[2]"));
		String v1 = ver.getText();
		System.out.println(v1);
		if (v1=="Checked") {
			System.out.println("expected message is displayed");
		} else {
			System.out.println("expected message is not displayed");
		}

		task21.findElement(By.xpath("//label[text()=\"Java\"]")).click();
		task21.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
		
	
		// verify tri-state is selected
		task21.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
		
		
		task21.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement toggle = task21.findElement(By.xpath("//span[text()=\\\"Checked\\\"]"));
		String t = toggle.getText();
		if (t=="Checked") {
			System.out.println("expected message is displayed");
		} else {
			System.out.println("expected message is not displayed");
		}
		//verify the expected message is displayed
		//verify the checkbox is disabled
		task21.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
		task21.findElement(By.xpath("(//label[text()=\"London\"])[1]")).click();
		task21.findElement(By.xpath("(//label[text()=\"Berlin\"])[1]")).click();
		task21.findElement(By.xpath("(//label[text()=\"Amsterdam\"])[1]")).click();
		task21.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		
	}

}
