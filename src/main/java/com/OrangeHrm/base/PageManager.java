package com.OrangeHrm.base;

import com.OrangeHrm.pages.LoginPage;

public class PageManager {

    public static LoginPage loginPage;
    
    public static void initializePageObject(){

        loginPage = new LoginPage();
    }

    public static void initializeDriver() {
    }
}
