package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("parthasaradi");
driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("karaikal");
driver.findElement(By.xpath("//span[text()='Site Name']/following::input")).sendKeys("pondicherry");
driver.findElement(By.xpath("//span[text()='Annual Revenue']/following::input")).sendKeys("1000000");
WebElement drop1 = driver.findElement(By.name("industryEnumId"));
Select tools=new Select(drop1);
tools.selectByValue("IND_SOFTWARE");
WebElement drop2 = driver.findElement(By.name("ownershipEnumId"));
Select tools1=new Select(drop2);
tools1.selectByVisibleText("Sole Proprietorship");
WebElement drop3 = driver.findElement(By.name("dataSourceId"));
Select tools2= new Select(drop3);
tools2.selectByValue("LEAD_EMPLOYEE");
WebElement drop4 = driver.findElement(By.id("marketingCampaignId"));
Select tools3= new Select(drop4);
tools3.selectByVisibleText("eCommerce Site Internal Campaign");
WebElement drop5 = driver.findElement(By.name("generalStateProvinceGeoId"));
Select tools4= new Select(drop5);
tools4.selectByValue("TX");

driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
