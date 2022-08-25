package Testngprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Checksequence {
	@Test(priority=2)
	public void atestcase1() {
	System.out.println("1st running");	
	}
	@Test(priority=1)
	public void stestcase2() {
	System.out.println("2nd running");	
	Reporter.log("checking reporter", true);
	}
	


}
