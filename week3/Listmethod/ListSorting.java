package Listmethod;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ListSorting {

	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ajio.com/");
		
		

	}

}
