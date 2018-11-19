package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
public void waitforpageload()
{
BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
}
public void waitforelementpresent(WebElement element)
{
WebDriverWait wait=new WebDriverWait(BaseClass.driver, 20);
wait.until(ExpectedConditions.visibilityOf(element));
}
public void alertok()
{
BaseClass.driver.switchTo().alert().accept();	
}
public void alertcancel()
{
BaseClass.driver.switchTo().alert().dismiss();	
}

public void rightclick(WebElement element)
{
Actions act=new Actions(BaseClass.driver);
act.contextClick(element).perform();
}

public void select(WebElement element,String data)
{
Select sel=new Select(element)	;
sel.selectByVisibleText(data);
}
}
