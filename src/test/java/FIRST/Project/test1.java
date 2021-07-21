package FIRST.Project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test1 {

	@Test
	public void m1()
	{SoftAssert sa=new SoftAssert();
		System.out.println("test");
	}
	@Test
	public void m2()
	{
		System.out.println("m2");
	}
}
