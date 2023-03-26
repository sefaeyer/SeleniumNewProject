package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) {
        /*
            Relative Locator:
                -bir web sayfasinda benzer ozelliklere sahip webelementlerin oldugu durumlarda kullanilabilir
                -above -> Belirtilen elementin ustunde olan elementi secer
                -below -> Belirtilen elementin altinda olan elementi secer
                -to_left_of -> Belirtilen elementin solunda olan elementi secer
                -to_right_of -> Belirtilen elementin saginda olan elementi secer
                -near -> Belirtilen elementin yakininda olan elementi secer
         */

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBike.click();

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım


    }
}
