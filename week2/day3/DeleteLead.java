package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();

driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("9952613406");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

Thread .sleep(1500);
WebElement firstResultingLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
String leadID = firstResultingLead.getText();


firstResultingLead.click();
driver.findElement(By.linkText("Delete")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.name("id")).sendKeys(leadID);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
if (message.equals("No records to display")) {
    System.out.println("Lead deletion confirmed.");
} else {
    System.out.println("Lead deletion not confirmed.");
}


driver.quit();






	}

}
