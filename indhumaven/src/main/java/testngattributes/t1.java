package testngattributes;

import org.testng.annotations.Test;

public class t1 {
	
	/*
	 * 
	 * 
	 * 
	 * annotations, atributes,suite,parallel
	 * automatic report generation
	 * 
	 * Test cases
	 *   non static
	 *   @Test
	 *   default order: alphabetical order
	 */

	@Test(priority=0,description="ONE",groups="Eight",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="TWO",groups="Eight")
	public void m2()
	{
		System.out.println("Test case 2");
	}
		
	@Test(priority=2,description="It is third",groups="Seven")
	public void ab()
	{
		System.out.println("Test case 3");
	}
}
