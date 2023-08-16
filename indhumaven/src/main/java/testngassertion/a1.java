package testngassertion;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglist.c1.class)
public class a1 {
	
	/*
	 *assertion: technique where we will be comparing actual result with obtained result
	 *
	 * hard asserts:
	 *      provided by assert builtin class
	 *      static in nature
	 *      assertion fail=> stop the execution
	 *      
	 * soft asserts:
	 *     provided by Softassert builtin class
	 *     nonstatic in nature
	 *     assertion fail=> it will proceed further 
	 *     
	 *     
	 * assertEqual(actual,expected)we will expect to be equal
	 * assertnotEqual(actual, expected)we will expect to be notequal
	 * assertTrue(condition)we will expect the condition to be true
	 * assertFalse(condition)we will expect the condition to be false
	 * 
	 * * 
	 * */

	
	@Test
	public void hd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
	    //classname objectnmae= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");

		//Assert.assertEquals(ob.getTitle(), "yahoo");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();

	}
}
