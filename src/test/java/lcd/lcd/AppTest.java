package lcd.lcd;

import static org.junit.Assert.*;

import org.approvaltests.Approvals;
import org.junit.Test;


public class AppTest 
{
	@Test
    public void displayZero() throws Exception
    {
    	App app = new App();
    	app.Display(0);
    	
    	Approvals.verify(app.formatOutput());
    }
		
	@Test
	public void displayTwo() throws Exception 
	{
		App app = new App();
		app.Display(2);
		
		Approvals.verify(app.formatOutput());
	}
	
	@Test
	public void displayThree() throws Exception 
	{
		App app = new App();
		app.Display(3);
		
		Approvals.verify(app.formatOutput());
	}
	
	@Test
    public void displayAll() throws Exception
    {
    	App app = new App();
    	
    	for(int i = 0; i <10; i++)
    	{
    		app.Display(i);
    	}
    	
    	Approvals.verify(app.formatOutput());
		
    }

}
