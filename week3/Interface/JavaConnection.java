package Interface;
//create concrete class using keyword implement


public class JavaConnection implements DataBaseConnection {
	
	public void connect()
	{
		System.out.println("connect to database");
	}
	public void disconnect()
	{
		System.out.println("disconnect to database");
	}
    public void executeUpdate()
{
	System.out.println("execute to database");
}
	public static void main(String[] args) {//create object
		
		JavaConnection ec = new JavaConnection();//call the method and print
		
		ec.connect();
		
		ec.disconnect();
	
		
		ec.executeUpdate();
		

	}
	@Override
	public void Connect() {
		// TODO Auto-generated method stub
		
	}

}
