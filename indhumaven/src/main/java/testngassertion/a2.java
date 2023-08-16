package testngassertion;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {
	/* softAssert
	 * provided by softassert builtin class
	 * nontatic in nature
	 * 
	 */

	@Test
	public void sft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
	    //classname objectnmae= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(ob.getTitle(), "yahoo");//error
		s.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		ob.quit();
		s.assertAll();
		    
}
}
