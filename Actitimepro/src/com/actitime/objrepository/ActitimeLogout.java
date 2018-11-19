package com.actitime.objrepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;

public class ActitimeLogout {
@FindBy(xpath="//a[text()='Logout']")
private WebElement logoutbtn;

public WebElement getLogoutbtn() {
	return logoutbtn;
}

public void logoutactitime()
{
	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
logoutbtn.click();	
}
}
