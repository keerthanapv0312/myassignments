package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMethod {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com/");
		
		
		List<WebElement> link=driver .findElements(By.tagName("a"));
		
		int everylinks=link.size();
		
		System.out.println("total tinks in the website:"+everylinks);
		
		for (int i = 0; i < link.size(); i++) {
			
			System.out.println(link.get(i).getText());
			
			
		}
		
		
	}

}
