package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        Browser[] browser = {new GoogleChrome(),new FireFox(),new Safari(),new IE()};
        for(Browser browsers:browser){
            browsers.openBrowser();
            browsers.loadPage("www.google.com");
            browsers.testThePage();
            browsers.closeBrowser();
        }
    }
}
