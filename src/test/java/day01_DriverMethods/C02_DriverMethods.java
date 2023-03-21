package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_DriverMethods {
    static ChromeOptions options;
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://techproeducation.com");
        System.out.println("Title = " + driver.getTitle());
        System.out.println("Url = " + driver.getCurrentUrl());

        driver.get("https://amazon.com");
        System.out.println("Title = " + driver.getTitle());
        System.out.println("Url = " + driver.getCurrentUrl());
        System.out.println("WindowHandle() = " + driver.getWindowHandle());
    }
}
