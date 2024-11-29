package week3.day1.assignment.overriding;

public class BasePage {
	
	public void findElement() {
		 
		System.out.println("find element");
	}

	public void clickElement()
	
	{
		System.out.println("click element");
		
	}
	
	public void enterText()
	
	{
		System.out.println("enter text");
		
	}
	
	public void performcommonTasks()
	{
		System.out.println("performcommontasks");
	}
	public static void main(String[] args) {
		
		BasePage mo = new BasePage();
		
		mo.findElement();
		
		mo.enterText();
		
		mo.clickElement();
		
		mo.performcommonTasks();
	

	}

}
