package w2d1_Assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Duration;

public class facebook {

	public static void main(String[] args) {
		ChromeDriver fb = new ChromeDriver();
		
		fb.get("https://en-gb.facebook.com/");
		fb.manage().window().maximize();
		//fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		fb.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		fb.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("captain");
		fb.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("America");
		
		WebElement day = fb.findElement(By.xpath("//select[@id=\"day\"]"));
		Select daydd = new Select(day);
		daydd.selectByValue("30");
		
		WebElement month = fb.findElement(By.xpath("//select[@id=\"month\"]"));
		Select monthdd = new Select(month);
		monthdd.selectByValue("11");
		
		WebElement year = fb.findElement(By.xpath("//select[@id=\"year\"]"));
		Select yeardd = new Select(year);
		yeardd.selectByValue("1995");
		
		fb.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Calix@123"); 
		fb.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("9965913472");
		fb.findElement(By.xpath("//label[text()='Male']")).click();
		

	}

}
