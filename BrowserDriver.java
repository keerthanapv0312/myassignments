package week2.day1.assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
       
	
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
	
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("keerthana");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("p v");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("welcome");
		
		driver.findElement(By.className("Create Lead")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
