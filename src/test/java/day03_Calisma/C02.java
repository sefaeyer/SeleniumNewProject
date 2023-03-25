package day03_Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

        /*
            amzon.com a gidin
            "city bike"
            20 inch tekerlegi secin
            sayfayi kapatin
         */

        driver.get("https://amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        //under 200 olani tiklatin
        WebElement we1 = driver.findElement(By.xpath("//span[.='$200 to $500']"));//attribute ismi yoksa "." koy
        we1.click();

        driver.close();

    }
}
