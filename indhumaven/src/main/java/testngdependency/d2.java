package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	
	/*
	 * k: ab,bc       letters: pass
	 * even 1 fails   letters: skipped
	 */	
	
	@Test(priority=0,groups="k")
	public void ab()
	{
		System.out.println("one");
	}
	
	

	@Test(priority=1,groups="k")
	public void bc()
	{
		System.out.println("two");
	}
	
	
	@Test(priority=2,dependsOnGroups="k")
	public void letters()
	{
		System.out.println("three");
	}

}
