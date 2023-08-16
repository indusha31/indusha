package testngannotation;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test : run only once before all the test cases started its execution
	 * after test : run only once after all the test cases finished its execution
	 * 
	 * before class: run only once after before test
	 * after class:  run only once before after test
	 * 
	 * before method: run before each test cases
	 * after method : run after each test cases
	 * 
	 *   before test: website visiting
	 *      before class: 
	 *        before method: tc1: after method:
	 *        before method: tc2: after method:
	 *      after class: 
	 *   after test: 
	 */

	ChromeDriver ob;
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
        //classname objectname= new classname();
		ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");	
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test");
		ob.quit();		
    }
	
	@BeforeClass
	public void btc()
	{
		System.out.println("before class");
		ob.manage().window().maximize();		
    }
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class");
		System.out.println(ob.getCurrentUrl());		
	}
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method");
		ob.navigate().refresh();		
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method");
		ob.manage().deleteAllCookies();		
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1");
		System.out.println(ob.getTitle());
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("Help").click();
	}
}
