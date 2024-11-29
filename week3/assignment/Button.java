package week3.day1.assignment;

public class Button extends WebElement{
	
public void submit() {
		
		System.out.println("submit");
	}
	
	public void getText() {
		
		System.out.println("gettext");
	}

	public static void main(String[] args) {
		
	
		
		Button p = new Button();
		
		p.click();
		p.setText(null);
		
		p.submit();
		
		p.getText();
		
		
		
	
		
		
		
  

	 

	}

}
