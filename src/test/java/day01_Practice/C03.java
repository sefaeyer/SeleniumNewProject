package day01_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        // ilk kutucuga 20 giriniz
        // ikinci kutucuga 30 giriniz
        // calculate'e tıklayınız
        // sonucu yazdırınız
        // sayfayi kapatiniz

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        //tam ekran yapalimmm...
        driver.manage().window().maximize();

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz
        //driver.findElement(By.id("number1")).sendKeys("20", Keys.ENTER);
        WebElement ilkKutucuk =  driver.findElement(By.id("number1"));
        ilkKutucuk.sendKeys("20",Keys.ENTER);
        Thread.sleep(2500);

        // ikinci kutucuga 30 giriniz
        //driver.findElement(By.id("number2")).sendKeys("30", Keys.ENTER);
        WebElement ikinciKutucuk = driver.findElement(By.id("number2"));
        ikinciKutucuk.sendKeys("30",Keys.ENTER);
        Thread.sleep(2500);

        // calculate'e tıklayınız
        driver.findElement(By.id("calculate")).submit();
        Thread.sleep(2500);

        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("Sonuc = " + sonuc.getText());
        Thread.sleep(2500);

        // sayfayi kapatiniz
        driver.close();

    }
}
