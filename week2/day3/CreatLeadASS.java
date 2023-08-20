package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatLeadASS {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.xpath("//div[@for='crmsfa']//a[1]")).click();
driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Parthasaradi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vengadaraman");

driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saradi.66@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9952613406");
driver.findElement(By.className("smallSubmit")).click();
	}

}
