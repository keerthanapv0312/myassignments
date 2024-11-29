package week3.day1.assignment;

public class  LoginTestData extends TestData {
	
	public void enterUsername()
	{
		System.out.println("enterusername");
	}
	
	public void enterPassword()
	{
		System.out.println("enterpassword");
	}

	public static void main(String[] args) {
		
		LoginTestData p= new LoginTestData();
		
		p.enterUsername();
		
		p.enterPassword();
		
		p.enterCredentials();
		
		p.navigateToHomePage();
		
		
		
		
	
	}
}
