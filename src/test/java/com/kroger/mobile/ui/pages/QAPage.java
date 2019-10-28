package com.kroger.mobile.ui.pages;

import com.kroger.mobile.ui.maps.QAMap;
import com.krogerqa.seleniumcentral.framework.main.MobileCommands;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class QAPage {

    private MobileCommands mobileCommands = new MobileCommands();
    private QAMap qaMap = new QAMap();
    
    public void login()
    {
        mobileCommands.tap(qaMap.loginBtn());
    }

    public void nativeView() {
        mobileCommands.tap(qaMap.nativeView());
        mobileCommands.assertElementExists(qaMap.viewOneLabel(),true);
    }

    public void back(){
        mobileCommands.tap(qaMap.back());

    }

    public void longPress (){
        mobileCommands.tap(qaMap.longPress());
        mobileCommands.assertElementExists(qaMap.longPressLabel(),true);
        mobileCommands.longTapOnElement(qaMap.longPressBtn());
        mobileCommands.tap(qaMap.okBtn());

    }
}
