package org.testing;

import org.testng.annotations.Test;

public class B {
	@Test
	private void tc6() {
	System.out.println("Test 6: " +Thread.currentThread().getId());
	}
	@Test
	private void tc7() {
	System.out.println("Test 7: " +Thread.currentThread().getId());
	}
@Test
private void tc8() {
	System.out.println("Test 8: "+Thread.currentThread().getId());
}
}
