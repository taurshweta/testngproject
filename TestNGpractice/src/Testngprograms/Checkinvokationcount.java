package Testngprograms;

import org.testng.annotations.Test;

public class Checkinvokationcount {
	@Test(invocationCount = 10)
	public void write() {
		System.out.println("write method");
	}
	@Test(invocationCount= 7)
	public void read()
	{
		System.out.println("read method");
	}
	
}
