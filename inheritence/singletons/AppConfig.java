package inheritence.singletons;

public class AppConfig 
{  
	AppConfig()
	{
		
}
	
	private static AppConfig obj = new AppConfig();
	public static AppConfig getInstance()
	{
		
		return obj();
	}


	private static AppConfig obj() {
		return null;
	}


	public static void main(String[] args) 
	{
		

	}

}
