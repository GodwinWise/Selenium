package org.testing;

import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups="sanity")
	private void tc1() {
		System.out.println("tc1");

	}
	@Test(groups= {"smoke","regression"})
	private void tc2() {
		System.out.println("tc2");
}
	@Test(groups="sanity")
	private void tc3() {
		System.out.println("tc3");
}
	@Test
	private void tc4() {
		System.out.println("tc4");
}
	@Test(groups="sanity")
	private void tc5() {
		System.out.println("tc5");
	}
	@Test
	private void tc6() {
		System.out.println("tc6");
}
}