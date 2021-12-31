package org.testing;

import org.testng.annotations.Test;

public class C {
@Test
private void tc9() {
	System.out.println("Test 9 " +Thread.currentThread().getId());

}
@Test
private void tc10() {
	System.out.println("Test 10: " +Thread.currentThread().getId());

}

}
