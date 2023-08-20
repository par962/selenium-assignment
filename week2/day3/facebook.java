package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 driver.findElement(By.linkText("Create new account")).click();
 driver.findElement(By.name("firstname")).sendKeys("partha");
 driver.findElement(By.name("lastname")).sendKeys("vengdraman");
 driver.findElement(By.name("reg_email__")).sendKeys("9952613406");
 driver.findElement(By.name("reg_passwd__")).sendKeys("partha6691");
 WebElement drop1 = driver.findElement(By.id("day"));
 Select tools=new Select(drop1);
 tools.selectByValue("6");
 WebElement drop2 = driver.findElement(By.id("month"));
 Select tools1=new Select(drop2);
 tools1.selectByVisibleText("Jun");
 WebElement drop3 = driver.findElement(By.id("year"));
 Select tools2= new Select(drop3);
 tools2.selectByValue("1991");
 driver.findElement(By.xpath("//label[text()='Male']")).click();

 		
 
 
 
	}

}
