package w2d1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		ChromeDriver task1 = new ChromeDriver();
		
		task1.get("http://leaftaps.com/opentaps/control/main");
		task1.manage().window().maximize();
		
		task1.findElement(By.id("username")).sendKeys("democsr");
		task1.findElement(By.id("password")).sendKeys("crmsfa");
		task1.findElement(By.className("decorativeSubmit")).click();
		
		task1.findElement(By.linkText("CRM/SFA")).click();
		task1.findElement(By.linkText("Accounts")).click();
		task1.findElement(By.xpath("//a[text()=\"Create Account\"]")).click();
		task1.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("captain");
		task1.findElement(By.xpath("//input[@id=\"officeSiteName\"]")).sendKeys("Marvels");
		task1.findElement(By.xpath("//input[@id=\"numberEmployees\"]")).sendKeys("11");
		task1.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
		
		String t = task1.getTitle();
		System.out.println(t);
		
		task1.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();

		task1.close();
				
	}

}
