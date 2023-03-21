package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Odev_02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.get("https://amazon.com"); //amazon sitesine gider

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari = " + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.manage().window().minimize(); // simge durumuna getirir

        Thread.sleep(3000);

        driver.manage().window().maximize(); // tam ekran yapar

        Thread.sleep(3000);

        System.out.println("sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari = " + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.manage().window().fullscreen(); // sayfayi full screen yapar

        Thread.sleep(3000);

        System.out.println("sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari = " + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.close();
    }
}
