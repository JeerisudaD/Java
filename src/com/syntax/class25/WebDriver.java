package com.syntax.class25;
/* Create a WebDriver Interface that will have the following unimplemented
behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening Chrome browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("close Chrome browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome window ");
    }
    @Override
    public void findElement(){
        System.out.println("Finding element on Chrome browser");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening Firefox browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize in Firefox");
    }
    @Override
    public void findElement(){
        System.out.println("Finding element on Firefox browser");
    }
}