package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemp {
	
	@Test(dependsOnGroups= {"sanity.*"})
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups= {"sanity1"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups= {"sanity2"})
	public void test4() {
		System.out.println("test4");
	}
}
