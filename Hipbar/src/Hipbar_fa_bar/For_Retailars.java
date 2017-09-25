package Hipbar_fa_bar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class For_Retailars 
{
WebDriver driver;
	@Test(priority=1)
	public void EmailField_Verification() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\java\\driver\\chromedriver.exe");	
	driver=new ChromeDriver();	
	driver.get("https://www.hipbar.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='snp-bld-step-1']/form/div[1]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='c-button--slide-left']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='c-menu--slide-left']/ul/li[3]/a")).click();
	for(int i=1;i<=17;i++)
	{
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	}
	Thread.sleep(2000);
	driver.findElement(By.name("input_1")).sendKeys("raja");
	Thread.sleep(2000);
	driver.findElement(By.name("input_2")).sendKeys("pyroferus");
	Thread.sleep(2000);
	
	driver.findElement(By.name("input_3")).sendKeys("rajapyro");
	Thread.sleep(2000);
	driver.findElement(By.id("gform_submit_button_3")).click();
	Thread.sleep(2000);
	
   if(driver.findElement(By.xpath(".//*[@id='field_3_3']/div[2]")).getText().equals("Please enter a valid email address."))
   {
	   System.out.println("Email field verification is pass");
   }
   else
   {
	   System.out.println("Email field verification is fail");
	   Assert.assertTrue(false);
   }
   driver.close();
   }

	
	@Test(priority=2)
	public void Password_Verification() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\java\\driver\\chromedriver.exe");	
	driver=new ChromeDriver();	
	driver.get("https://www.hipbar.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='snp-bld-step-1']/form/div[1]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='c-button--slide-left']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='c-menu--slide-left']/ul/li[3]/a")).click();
	for(int i=1;i<=17;i++)
	{
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	}
	Thread.sleep(2000);
	driver.findElement(By.name("input_1")).sendKeys("raja");
	Thread.sleep(2000);
	driver.findElement(By.name("input_2")).sendKeys("pyroferus");
	Thread.sleep(2000);
	
	driver.findElement(By.name("input_6")).sendKeys("rajapyro");
	Thread.sleep(2000);
	driver.findElement(By.id("gform_submit_button_3")).click();
	Thread.sleep(2000);
	
   if(driver.findElement(By.xpath(".//*[@id='field_3_6']/div[2]")).getText().equals("Please enter a valid Mobile Number."))
   {
	   System.out.println("Email field verification is pass");
   }
   else
   {
	   System.out.println("Mobile Number field verification is fail");
	   Assert.assertTrue(false);
   }
   }
	
	
	
	
	
}
