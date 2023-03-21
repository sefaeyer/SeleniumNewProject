package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        System.out.println("sayfa konumu = " + driver.manage().window().getPosition());//sayfa konumu
        System.out.println("sayfa boyutlari = " + driver.manage().window().getSize());//sayfa boyutu

        driver.manage().window().maximize();// browser i maximize yapar
        driver.get("https://techproeducation.com");

        System.out.println("sayfa konumu = " + driver.manage().window().getPosition());//sayfa konumu
        System.out.println("sayfa boyutlari = " + driver.manage().window().getSize());//sayfa boyutu

        driver.manage().window().minimize();//browser i asagiya indirir.
        Thread.sleep(3500);
        driver.manage().window().fullscreen();

        System.out.println("sayfa konumu = " + driver.manage().window().getPosition());//sayfa konumu
        System.out.println("sayfa boyutlari = " + driver.manage().window().getSize());//sayfa boyutu

        driver.manage().window().setPosition(new Point(50,50));//istedigimiz konum
        driver.manage().window().setSize(new Dimension(600,600));//istedigimiz boyut

        driver.close();


    }
}
