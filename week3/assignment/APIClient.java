package week3.day1.assignment;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("first endpoint of API Client:"+ endpoint);
	}
	
	
	
	public void sendRequest(String endpoint,boolean requeststatus, String requestbody)
	
	{
		System.out.println("request body by API client:"+requestbody);
		System.out.println("boolean request status by API client:"+requeststatus);
		System.out.println("request end point by API client:"+endpoint);
	}
		
	
	public static void main(String[] args) {
	
		APIClient mo=new APIClient();
		mo.sendRequest("full project", true, "text.xml");
		mo.sendRequest("half project");
		
	}
		
		
		
		

	}

