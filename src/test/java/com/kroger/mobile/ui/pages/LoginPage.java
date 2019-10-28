package com.kroger.mobile.ui.pages;

import com.krogerqa.seleniumcentral.framework.main.MobileCommands;
import com.kroger.mobile.ui.maps.LoginMap;

public class LoginPage{

    MobileCommands mobileCommands = new MobileCommands();
    LoginMap loginMap = new LoginMap();


public void login(){
    mobileCommands.tap(loginMap.loginBtn());

}

}
