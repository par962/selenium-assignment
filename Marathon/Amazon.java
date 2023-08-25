package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		  driver.findElement(By.xpath("//span[text()=' for mens']")).click();
		  
		  //String ofOver = driver.findElement(By.xpath("//span[text()='1-16 of over 80,000 results for']")).getText();		 
		  String ofOver = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
		  System.out.println("Results:" + ofOver);
		  
		  driver.findElement(By.xpath("//span[text()='American Tourister']")).click();
		  driver.findElement(By.xpath("//span[text()='Skybags']")).click();
		  
		  driver.findElement(By.id("a-autoid-0-announce")).click();
		  driver.findElement(By.linkText("Newest Arrivals")).click();
		  
		  String americanTourister = driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-underline-text')]//span")).getText();
		  System.out.println("First Result Details :" + americanTourister);
		  String  discountprice= driver.findElement(By.xpath("//span[text()='4,149']")).getText();
          System.out.println("Discount Price Rs:" + discountprice);
          
          driver.close();
	}

}
