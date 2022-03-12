package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;
import java.util.List;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[4]")).click();
		
			
	   String  Item=driver.findElement(By.className("length")).getText();
	   System.out.println("Total No of items  - "+Item);
	
	   
	   
		System.out.println("Name of the Brand ");
		List <WebElement> bagsname = driver.findElements(By.className("brand"));
		for (int i = 0; i < bagsname.size(); i++) {
			System.out.println(bagsname.get(i).getText());		
			
			
		}
	
		System.out.println("Name of the Bags ");
		List<WebElement> bagsName1 = driver.findElements(By.className("nameCls"));
	for (int j=0; j < bagsName1.size(); j++) {
		System.out.println(bagsName1.get(j).getText());
		
	}
	
	
	}



	}


