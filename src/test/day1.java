package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		System.out.println("PS implementing the day1 got itiiiiiiiiiiii");
		
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}



}
