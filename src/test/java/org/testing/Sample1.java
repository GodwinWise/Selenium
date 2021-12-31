package org.testing;

import org.testng.annotations.Test;

public class Sample1 {
@Test(retryAnalyzer=Rerun.class)
private void tc1() {
System.out.println("Test 1");
}
@Test(retryAnalyzer=Rerun.class)
private void tc2() {
System.out.println("Test 2");
}
@Test(retryAnalyzer=Rerun.class)
private void tc3() {
System.out.println(4/0);
System.out.println("Test 3");
}
@Test(retryAnalyzer=Rerun.class)
private void tc4() {
System.out.println(5/0);
System.out.println("Test 4");
}
}
