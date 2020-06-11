package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMavenDemo 
{
	@Test
	public void openbrowser()
	{
		Reporter.log("open the browser",true);
	}

	@Test
	public void execution()
	{
		Reporter.log("start the execution of the program",true);
	}
	@Test
	public void close()
	{
		Reporter.log("execution completed",true);
	}
}
