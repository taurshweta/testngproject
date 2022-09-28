package Testngprograms;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Reporter;

@Listeners(listenerutil.listener.class)
public class Checkenabled {
	@Test(priority=1)
	public void login() {
		System.out.println("login method");
		System.out.println("changes");
			}
	@Test(priority=2)
	@Parameters({"browser","version"})
	public void home(String checkbrowser, String checkversion) {
		if(checkbrowser.equals("chrome")) {
			Reporter.log("chrome running",true);
			Reporter.log("running with version"+checkversion,true);
		}
		else if(checkbrowser.equals("firefox")) {
			Reporter.log("firefox running",true);
		}
		System.out.println("home method");
	}
	@Test(priority=3)
	public void feed() {
		System.out.println("feed method");
	}
}
