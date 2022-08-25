package Testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checksoftassert {
	public static WebDriver driver;
	@BeforeTest
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void verifyurlofpage()
	{
		String url=driver.getCurrentUrl();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(url, "htt://ww.flpkart.com/","verifyingurl");
		System.out.println("nextline after Sassert");
		soft.assertAll();
	}
	@Test
	public void verifytitleofpage() {
		String pagetxt=driver.findElement(By.cssSelector("._36KMOx")).getText();
		Assert.assertEquals(pagetxt, "Login","verifying Title of childwindow");
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}

