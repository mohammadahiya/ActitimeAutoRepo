package com.actitime.objrepository;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileLib;


public class Loginactitime extends BaseClass{
@FindBy(id="username")
private WebElement usernameedit;

@FindBy(name="pwd")
private WebElement passwordedit;

@FindBy(xpath="//div[text()='Login ']")
private WebElement loginbtn;


public void Logintoacttime() throws Throwable
{
FileLib f=new FileLib();
Properties pobj=f.getpropertyobj();
usernameedit.sendKeys(pobj.getProperty("username"));

passwordedit.sendKeys(pobj.getProperty("password"));
loginbtn.click();

}
}
