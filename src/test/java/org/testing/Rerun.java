package org.testing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {
int min =0, max =3;
	public boolean retry(ITestResult result) {
		if (min < max) {
			min++;
			return true;
		}
		return false;
	}

}
