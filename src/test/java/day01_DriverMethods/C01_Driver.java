package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_Driver {
    static ChromeOptions options;
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        System.out.println(System.getProperty("chromeDriver"));
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://techproeducation.com/");
        System.out.println("sayfa basligi = " + driver.getTitle()); // icinde bulunulan sayfanin basligini verir
        System.out.println("sayfa URL: = " + driver.getCurrentUrl()); // icinde bulunulan sayfanin url ini verir
//        System.out.println("sayfanin html kodlari = " + driver.getPageSource());//icinde bulunulan sayfanin html kodlarini verir
    }
}
