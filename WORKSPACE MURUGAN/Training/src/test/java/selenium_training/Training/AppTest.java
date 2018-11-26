package selenium_training.Training;

import org.junit.Test;

public class AppTest extends Precondition
{
    @Test
    public void shouldAnswerWithTrue()
    {
    	browser.get("https://www.freecrm.com/index.html");
    	String title = browser.getTitle();
    	
    	System.out.print(title = "title");
    	
        
    }
}
