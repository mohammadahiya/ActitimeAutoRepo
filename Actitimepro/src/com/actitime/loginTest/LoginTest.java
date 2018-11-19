package com.actitime.loginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.objrepository.Loginactitime;

public class LoginTest extends BaseClass {
@Test
public void verifyloginpageTest() throws Throwable
{
	Loginactitime lacttime=PageFactory.initElements(BaseClass.driver,Loginactitime.class);
	lacttime.Logintoacttime();

	}
}
