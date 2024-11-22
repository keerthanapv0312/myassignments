package week2.day2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadsButton {

	public static void main(String[] args) throws InterruptedException {
		
		//Initializing the driver and get the URL
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		//using implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		//Logging in using exisiting credentials
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//creating lead using basic locator and xpath
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("keerthana");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("keerthi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pv");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("comment");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthanapv@gmail.com");
		
		//using webelement and select class to handle the dropdown
		
		
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		
		Select opt=new Select(state);
		 
		 opt.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		 
		 driver.findElement(By.linkText("Edit")).click();
		 
		 //clearing exisiting inputs
		
		WebElement user=driver.findElement(By.name("description"));
		
		user.sendKeys("comment");
		
		user.clear();
		
		user.sendKeys("testing");
		
		//update lead
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("update");
		
		driver.findElement(By.name("submitButton")).click();
		
		//print the title of the webpage
		 
		 
		 String title=driver.getTitle();
		 
		 System.out.print("Title of the page is:"    +title);
		 
		 Thread.sleep(10000);
		 
		 //closing the driver
		 
		 driver.close();
		 
		}

}
