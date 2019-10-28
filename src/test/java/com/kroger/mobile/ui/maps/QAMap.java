package com.kroger.mobile.ui.maps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class QAMap {

    public By loginBtn() { return MobileBy.AndroidUIAutomator("new UiSelector().text(\"LOG IN\")"); }
    public By nativeView(){ return By.xpath("//android.widget.TextView[@content-desc='chainedView']");}
    public By longPress(){ return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Long Press\")");}
    public By back() { return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Back\")");}
    public By longPressBtn(){ return MobileBy.AccessibilityId("longpress");}
    public By viewOneLabel(){return By.xpath("//android.widget.TextView[@text='Native View Demo']");}
    public By longPressLabel(){return By.xpath("//android.widget.TextView[@text='Long Press Demo']");}
    public By okBtn(){return By.id("android:id/button1");}
}
