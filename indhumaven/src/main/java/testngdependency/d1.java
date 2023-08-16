package testngdependency;

import org.testng.annotations.Test;

public class d1 {
	
	/*
	 * depends on methods: creating connection between test cases
	 * vstng: pass         lgg:run
	 * vstng: fail         lgg: skipped
	 */

	
	@Test(priority=0)
	public void vstng()
	{
		System.out.println("visiting");
	}
	
	
	@Test(priority=1,dependsOnMethods="vstng")
	public void lgg()
	{
		System.out.println("login");
	}
}
