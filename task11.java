package w2d1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task11 {

	public static void main(String[] args) {
		ChromeDriver task11 = new ChromeDriver();
		
		task11.get("http://leaftaps.com/opentaps/control/main");
		task11.manage().window().maximize();
		
		task11.findElement(By.id("username")).sendKeys("democsr");
		task11.findElement(By.id("password")).sendKeys("crmsfa");
		task11.findElement(By.className("decorativeSubmit")).click();
		
		task11.findElement(By.linkText("CRM/SFA")).click();
		task11.findElement(By.linkText("Accounts")).click();
		task11.findElement(By.xpath("//a[text()=\"Create Account\"]")).click();
		task11.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("caaptain");
		task11.findElement(By.xpath("//input[@id=\"officeSiteName\"]")).sendKeys("Maarvels");
		task11.findElement(By.xpath("//input[@id=\"numberEmployees\"]")).sendKeys("11");
		task11.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
		
		WebElement ind = task11.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select indd = new Select(ind);
		indd.selectByValue("IND_SOFTWARE");
		
		WebElement own = task11.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own1 = new Select(own);
		own1.selectByVisibleText("S-Corporation");
		
		WebElement sou = task11.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select sou1 = new Select(sou);
		sou1.selectByValue("LEAD_EMPLOYEE");
		
		WebElement mar = task11.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select mar1 = new Select(mar);
		mar1.selectByIndex(6);
		
		WebElement state = task11.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state1 = new Select(state);
		state1.selectByValue("TX");
		
		task11.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		
		task11.close();
		
		

	}

}
