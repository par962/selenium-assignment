package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditASS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("parthasaradi");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
WebElement firstResultingLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
firstResultingLead.click();

String pageTitle = driver.getTitle();
if (pageTitle.contains("View Lead")) {
    System.out.println("Page title verification successful.");
} else {
    System.out.println("Page title verification failed.");
}
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(" Nexon");
driver.findElement(By.className("smallSubmit")).click();

String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
if (updatedCompanyName.contains("parthasaradi nexon")) {
   System.out.println("Company name update confirmed.");
} else {
  System.out.println("Company name update not confirmed.");
}
driver.quit();

	}


	}


