package listeners;

import org.junit.Assert;
import org.testng.SkipException;

import org.testng.annotations.Test;
//import junit.framework.Assert;


public class TestNGListenerDemo2 {

	@Test
	public void test4() {
		System.out.println("Test4");
	}
	@Test
	public void test5() {
		System.out.println("Test5");
		Assert.assertTrue(false);
		
	}
	@Test
	public void test6 () {
		System.out.println("Test6");
		throw new SkipException("skipped");
	}
	
	

}
