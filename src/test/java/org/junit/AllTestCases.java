package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({UnitTest.class,A.class,B.class,C.class})
public class AllTestCases {
@Test
public void runTest() {
	Result ra = JUnitCore.runClasses(UnitTest.class,A.class,B.class,C.class);
	
	System.out.println("Run Count: "+ra.getRunCount());
	System.out.println("Failure Count: "+ra.getFailureCount());
	System.out.println("Ignored Count: "+ra.getIgnoreCount());
	List<Failure> li = ra.getFailures();
	for (Failure f : li) {
		System.out.println(f);
	}

}
}
