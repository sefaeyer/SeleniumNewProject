package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_Calisma01 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("city bike", Keys.ENTER);

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
        WebElement hybridBks = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));

        driver.findElement(with(By.tagName("a")).below(hybridBks)).click();
        driver.close();



    }
}
