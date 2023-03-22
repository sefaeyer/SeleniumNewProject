package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_WebelementLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasina gidiniz.
        driver.get("https://amazon.com");

        // Search Box bolumunu locate ediniz. Ve Amazon da iphone aratiniz.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella",Keys.ENTER);
        //submit yerine sendKeys("iphone",Keys.ENTER); yazabiliriz

        //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //searchBox.submit(); // Enter yapmak icin submit(); kullanilir.
        //NOT: bir webelement i birden fazla kullanilacaksa bir webelement e assign edilebilir

        //searchBox.sendKeys("iphone"); // Locate ettigimiz searchBox a iphone metnini gonderir

        Thread.sleep(4000);
        driver.close();


    }
}
