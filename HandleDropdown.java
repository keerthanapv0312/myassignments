package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

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
		
		driver.findElement(By.id("accountName")).sendKeys("keerthana0312");
		
		WebElement dropdown=driver.findElement(By.name("industryEnumId"));
		
		
		 Select opt=new Select(dropdown);
		 
		 opt.selectByValue("IND_SOFTWARE");
		 
		 WebElement dropdown1=driver.findElement(By.name("ownershipEnumId"));
			
			
		 Select opt1=new Select(dropdown1);
		 
		   opt1.selectByVisibleText("S-Corporation");
		   
		 WebElement dropdown2=driver.findElement(By.name("dataSourceId"));
			
			
		 Select opt2=new Select(dropdown2);
		 
		 
         opt2.selectByValue("LEAD_EMPLOYEE");
		 
		   
				 WebElement dropdown3=driver.findElement(By.name("marketingCampaignId"));
					
					
				 Select opt3=new Select(dropdown3);
				 
				 
		 opt3.selectByIndex(6);
		 
		 WebElement dropdown4=driver.findElement(By.name("generalStateProvinceGeoId"));
			
			
		 Select opt4=new Select(dropdown4);
		 
		 opt4.selectByValue("TX");
		 
		 
		driver.findElement(By.className("Create Account")).click();
		
			Thread.sleep(2000);
			
		driver.close();
		
		

	}

}
