package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws InterruptedException  {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				driver.get("https://www.pvrcinemas.com/");
				  driver.manage().window().maximize();
				  driver.findElement(By.xpath("(//div[@class='nav-icon']//i)[2]")).click();
				  driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
				 
				 WebElement drop1 = driver.findElement(By.name("city"));
			     Select tools=new Select(drop1);
			     tools.selectByVisibleText("Chennai");
			     WebElement drop2 = driver.findElement(By.name("genre"));
			     Select tools1=new Select(drop2);
			     tools1.selectByVisibleText("ANIMATION");
			     WebElement drop3 = driver.findElement(By.name("lang"));
			     Select tools2=new Select(drop3);
			     tools2.selectByIndex(1);
			     driver.findElement(By.xpath("//button[contains(@class,'btn btn-submit')]")).click();
			    Thread.sleep(5000);
			    
			     driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']//img")).click();
			     Thread.sleep(3000); 
			     driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
			     WebElement cinemaName = driver.findElement(By.id("cinemaName")); 
			     new Select(cinemaName).selectByVisibleText("PVR Heritage RSL ECR Chennai");
			     
			     WebElement timings = driver.findElement(By.xpath("(//select[contains(@class,'input-text form-control')])[2]")); 
			     new Select(timings).selectByIndex(1);
			     
			     driver.findElement(By.name("noOfTickets")).sendKeys("2");
			     driver.findElement(By.name("name")).sendKeys("Parthasaradi");
			     driver.findElement(By.name("email")).sendKeys("saradi.66@gmail.com");
			     driver.findElement(By.name("mobile")).sendKeys("9952613406");
			     WebElement food = driver.findElement(By.xpath("(//select[contains(@class,'input-text form-control')])[3]")); 
			     new Select(food).selectByValue("No"); 
			     driver.findElement(By.name("comment")).sendKeys("popcorn");
			     driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
			    
			     driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
					
			 	
		   		driver.findElement(By.className("swal2-close")).click();
			   			Thread.sleep(2000);
			   	driver.findElement(By.xpath("(//button[contains(text(),'CANCEL')])[2]")).click();
			   		
			   		System.out.println("Page Title:"+driver.getTitle());
			     
			     
	}

}
