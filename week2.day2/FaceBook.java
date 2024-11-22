package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
	
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("keerthana");
		
		driver.findElement(By.name("lastname")).sendKeys("vara");
		
	
		driver.findElement(By.name("reg_email__")).sendKeys("keerthana");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("kanishq");
		 
		
		
       WebElement  dropdown= driver.findElement(By.name("birthday_day"));
       
       Select obj=new Select(dropdown);
       
       obj.selectByValue("18");
       
      WebElement month= driver.findElement(By.id("month"));
       
       Select obj1=new Select(month);
       
       obj1.selectByVisibleText("Feb");
       
       
     WebElement year= driver.findElement(By.id("year"));
       
       Select obj2=new Select(year);
       
       obj2.selectByValue("2023");
       
       
       //radio button
       
       
       driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
       
       
       
       
       
       
       
    
       
       



	}

}
