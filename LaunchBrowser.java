package week2.day.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Accounts")).click();
	
	driver.findElement(By.linkText("Create Account")).click();
	
	driver.findElement(By.id("accountName")).sendKeys("keerthanapv");
	//driver.findElement(By.className("description")).sendKeys("selenium automation tester");
	
	
	driver.findElement(By.id("officeSiteName")).sendKeys("leaftaps");
	
	driver.findElement(By.id("numberEmployees")).sendKeys("5");
	
	
	driver.findElement(By.className("Create Account")).click();
	
		Thread.sleep(2000);
	driver.close();
	
	
		

	}

}
