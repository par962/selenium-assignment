package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoopingwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("New Releases")).click();
        
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> lstwindowHandles=new ArrayList<String>(windowHandles);
        driver.switchTo().window(lstwindowHandles.get(1));
        driver.close();
        
	}

}
