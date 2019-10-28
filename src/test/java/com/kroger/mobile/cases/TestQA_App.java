package com.kroger.mobile.cases;


import com.kroger.mobile.ui.pages.QAPage;
import com.krogerqa.seleniumcentral.framework.main.BaseTest;
import org.testng.annotations.Test;

public class TestQA_App extends BaseTest {
    
    QAPage qaPage = new QAPage();
    
    @Test(groups = {"smoke"}, enabled = true)
    public void tc_Test() {
        
        qaPage.login();
        qaPage.nativeView();
        qaPage.back();
        qaPage.longPress();
        qaPage.back();
        
    }

}
