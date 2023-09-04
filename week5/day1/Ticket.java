package week5.day1;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;



public class Ticket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.irctc.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        System.out.println(driver.getTitle());
        //click open
        driver.findElement(By.linkText("FLIGHTS")).click();   
       
        Set<String> windowHandles = driver.getWindowHandles();
        
       List<String> lstwindowHandles=new ArrayList<String>(windowHandles);     
       
       driver.switchTo().window(lstwindowHandles.get(1));
  		System.out.println(driver.getTitle());
      		driver.close();
     	
     		driver.switchTo().window(lstwindowHandles.get(0));
     		System.out.println(driver.getTitle());
     		 File source = driver.getScreenshotAs(OutputType.FILE);//ctrl+2+l
             //create a folder
             File Target =new File("./snap/irctc.png");
             //Merge source and target
             FileUtils.copyFile(source, Target);
             
	}

}
