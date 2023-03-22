package day01_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) throws InterruptedException {

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        // sayfayi kapatiniz

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().maximize();
        System.out.println("Maximize Pencere Konumu = " + driver.manage().window().getPosition());
        System.out.println("Maximize Pencere Olcusu = " + driver.manage().window().getSize());
        Thread.sleep(2000);


        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen Pencere Konumu = " + driver.manage().window().getPosition());
        System.out.println("Fullscreen Pencere Olcusu = " + driver.manage().window().getSize());
        Thread.sleep(2000);


        // sayfayi kapatiniz
        driver.close();

    }
}
