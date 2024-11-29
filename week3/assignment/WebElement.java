package week3.day1.assignment;

public class WebElement {
	
	public void click() {
		
		System.out.println("click");
	}
	
	public void setText(String text) {
		
		System.out.println("string");
	}

	public static void main(String[] args) {
		
		WebElement p = new WebElement();
		
		p.click();
		
		p.setText("hi");
		

	}

}
