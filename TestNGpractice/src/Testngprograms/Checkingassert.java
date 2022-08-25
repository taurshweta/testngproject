package Testngprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkingassert {
	public static WebDriver driver;
	@BeforeTest(groups="launch")
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1,groups="sanity")
	public void verifyurlofpage()
	{
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.flipkart.com/","verifyingurl");
		System.out.println("nextline after hardassert");
	}
	@Test(priority=2,groups="sanity")
	public void verifytitleofpage() {
		String pagetxt=driver.findElement(By.cssSelector("._36KMOx")).getText();
		Assert.assertEquals(pagetxt, "Login","verifying Title of childwindow");
	}

	@Test(priority=3)
	public void verifyicontopoffersisdisplayed() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		boolean result=driver.findElement(By.xpath("//*[text()='Top Offers']")).isDisplayed();
		Assert.assertEquals(result, true);	}
	@Test(priority=4)
	public void verifyicongroceryisdisplayed() {
		
		boolean result=driver.findElement(By.xpath("//*[text()='Grocery']")).isDisplayed();
		Assert.assertEquals(result, true);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
