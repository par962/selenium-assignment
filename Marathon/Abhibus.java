package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.abhibus.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Bus")).click();
		  driver.findElement(By.id("source")).sendKeys("Chennai");
		  driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		  
		  driver.findElement(By.id("destination")).sendKeys("Bangalore");
		  driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		  
		  driver.findElement(By.id("datepicker1")).click();
		  driver.findElement(By.xpath("(//a[@href='#'])[3]")).click();
		 
		  driver.findElement(By.linkText("Search")).click();
		  
		  String yoloBus = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText();
         System.out.println("First Result Bus Name:"+ yoloBus);		  
         
         driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
         String seatsAvailable = driver.findElement(By.xpath("//p[@availsts='17']")).getText();
         System.out.println("Availble seat for First Result:"+ seatsAvailable);
         
         driver.findElement(By.xpath("//span[@class='book']")).click();
         driver.findElement(By.cssSelector("a#UO4-3ZZ")).click();
         
         String dU = driver.findElement(By.cssSelector("span#seatnos")).getText();
         System.out.println("Selected seat :"+ dU); 
         
         String  rS= driver.findElement(By.xpath("//span[text()=' 709.00']")).getText();
         System.out.println("Ticket Fare RS: "+rS);
                
         WebElement drop1 = driver.findElement(By.id("boardingpoint_id"));
         Select tools=new Select(drop1);
         tools.selectByIndex(2);
         WebElement drop2 = driver.findElement(By.id("droppingpoint_id"));
         Select tools1=new Select(drop2);
         tools1.selectByIndex(3);
         String title=driver.getTitle();
         System.out.println("Title Page is: "+ title);
         driver.close();
	}

}
