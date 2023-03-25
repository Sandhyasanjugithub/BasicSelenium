package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class Test1 {
	@Test(priority=-1,invocationCount=5)
public void calls()

{
	Reporter.log("calls", true);
}

@Test(priority=-1,enabled=false)
public void settings()
{
	Reporter.log("settings", false);
}
@Test(priority=0)
public void chats()
{
	Reporter.log("chats", true);
}
}