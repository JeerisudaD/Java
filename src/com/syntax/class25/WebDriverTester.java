package com.syntax.class25;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chrom = new ChromeDriver();
        chrom.openBrowser();
        chrom.closeBrowser();
        chrom.maximizeWindow();
        chrom.findElement();
        System.out.println("------------------");

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.openBrowser();
        firefox.closeBrowser();
        firefox.maximizeWindow();
        firefox.findElement();
    }

}
