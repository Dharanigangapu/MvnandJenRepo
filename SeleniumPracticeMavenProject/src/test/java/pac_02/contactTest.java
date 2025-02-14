package pac_02;

import org.testng.annotations.Test;

public class contactTest {
	
	@Test
	public void createcontact()
	{
		String URL = System.getProperty("url");
		String BROWSER=System.getProperty("browse");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
	System.out.println("execute ");
	}
	@Test
	public void modifythecontact()
	{
	System.out.println("execute ");
	}
	
	@Test
	public void deletethecontact()
	{
	System.out.println("execute ");
	}
	

}
