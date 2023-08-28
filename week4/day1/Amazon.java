package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

			public static void main(String[] args) {
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.amazon.in/");
			//
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
			//store the String of element
			List<Integer> sortPrice=new ArrayList<Integer>();
			//locate multiple element
			List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			System.out.println(price.size());
			for (int i = 0; i <price.size() ; i++) {
				
				String text = price.get(i).getText();//" 10,999"
				
				String replaceAll = text.replaceAll("[^0-9]","");//10999
				
				int parseInt = Integer.parseInt(replaceAll);
				
				sortPrice.add(parseInt);//element add into list
			}
			Collections.sort(sortPrice);
			System.out.println(sortPrice);
			System.out.println("Lowest Price:"+sortPrice.get(0));
		}

	
	}


