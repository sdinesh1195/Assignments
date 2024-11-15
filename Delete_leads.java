package w2d1_Assignments;

import java.nio.file.spi.FileSystemProvider;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;

public class Delete_leads {

	public static void main(String[] args) {
        ChromeDriver t3 = new ChromeDriver();
		
        t3.get("http://leaftaps.com/opentaps/");
        t3.manage().window().maximize();
        t3.findElement(By.id("username")).sendKeys("democsr");
        t3.findElement(By.id("password")).sendKeys("crmsfa");
        t3.findElement(By.className("decorativeSubmit")).click();
        t3.findElement(By.linkText("CRM/SFA")).click();
        t3.findElement(By.linkText("Leads")).click();
        t3.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
        t3.findElement(By.xpath("//span[text()=\"Phone\"]")).click();
        t3.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
        t3.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("996591347");
        t3.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
        t3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //capture lead id
        WebElement lead = t3.findElement(By.xpath("//a[text()=\"14155\"]"));
        String l=lead.getText();
        System.out.println(l);
        
        WebElement clk = t3.findElement(By.xpath("(//a[@class='linktext'])[4]"));
        clk.click();
        t3.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        
        t3.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
        t3.findElement(By.xpath("//input[@name='id']")).click();
        t3.findElement(By.xpath("//input[@name='id']")).sendKeys(l);
        t3.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
        
        WebElement verify = t3.findElement(By.xpath("//div[text()=\"No records to display\"]"));
        String v = verify.getText();
        String r = "No records to display";
        if (v==r) {
        	System.out.println("Deleted successfully");
        }
        
        t3.close();
        
		

	}

}
