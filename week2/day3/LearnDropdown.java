package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();

driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Parthasaradi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vengadaraman");
WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select tools=new Select(drop1);
tools.selectByValue("LEAD_EMPLOYEE");
WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select tools1=new Select(drop2);
tools1.selectByVisibleText("Car and Driver");
WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select tools2= new Select(drop3);
tools2.selectByValue("OWN_PARTNERSHIP");

driver.findElement(By.className("smallSubmit")).click();

	}

}
