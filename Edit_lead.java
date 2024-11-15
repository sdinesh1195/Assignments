package w2d1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_lead {

	public static void main(String[] args) {
		ChromeDriver t2 = new ChromeDriver();
		
		t2.get("http://leaftaps.com/opentaps/");
		t2.manage().window().maximize();
		t2.findElement(By.id("username")).sendKeys("democsr");
		t2.findElement(By.id("password")).sendKeys("crmsfa");
		t2.findElement(By.className("decorativeSubmit")).click();
		t2.findElement(By.linkText("CRM/SFA")).click();
		t2.findElement(By.linkText("Leads")).click();
		t2.findElement(By.linkText("Create Lead")).click();
		t2.findElement(By.id("createLeadForm_companyName")).sendKeys("Marvels");
		t2.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Captain");
		t2.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("America");
		t2.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Dc");
		t2.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("xyz");
		t2.findElement(By.id("createLeadForm_description")).sendKeys("abc");
		t2.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sdineshqa1@gmail.com");
		
		WebElement state = t2.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stated = new Select(state);
		stated.selectByVisibleText("New York");
		
		
		t2.findElement(By.xpath("//input[@id=\"createLeadForm_generalProfTitle\"]")).sendKeys("Civil war");
		
		
	    t2.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("91");
		t2.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("996591347");
		
		String title = t2.getTitle();
		System.out.println(title);
		
		t2.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		t2.findElement(By.xpath("//a[text()=\"Edit\"]")).click();
		WebElement cl = t2.findElement(By.id("updateLeadForm_description"));
		cl.clear();
		t2.findElement(By.id("updateLeadForm_importantNote")).sendKeys("abc");
		t2.findElement(By.xpath("//input[@value='Update']")).click();
		
		String s=t2.getTitle();
		System.out.println(s);
		
		
		
		t2.close();

	}
}

