package com.actitime.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;






public class BaseClass {
	public static WebDriver driver;	
   @BeforeClass
   public void configBC()
   {
	   System.out.println("====Launch the browser====");
	   driver=new FirefoxDriver();
   }
	@BeforeMethod
      public void configBM() throws Throwable
   {
	   System.out.println("Login");
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   FileLib fib=new FileLib();
	   Properties pobj=fib.getpropertyobj();
	   
 driver.get(pobj.getProperty("url"));
//       
//       driver.findElement(By.id("identifierId")).sendKeys(pobj.getProperty("username"));
//       driver.findElement(By.xpath("//span[text()='Next']")).click();
//       Thread.sleep(1500);
//       driver.findElement(By.name("password")).sendKeys(pobj.getProperty("password"));
//       driver.findElement(By.xpath("//span[text()='Next']")).click();
//       Thread.sleep(8000);
//	   
       
   }
	@AfterMethod
	public void configAM()
	{
		/*ActitimeLogout lout=PageFactory.initElements(driver, ActitimeLogout.class);
		lout.logoutactitime();
*/
	}
	@AfterClass
	public void configAC()
	{
		//driver.close();
	}
	
	
}
