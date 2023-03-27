package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C04_Calisma02 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html    adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //Berlin’i 3 farkli relative locator ile locate edin
        WebElement NYC = driver.findElement(By.xpath("//img[@id='pid3_thumb']"));
        WebElement boston = driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement sailor = driver.findElement(By.xpath("//img[@id='pid11_thumb']"));
        WebElement bayArea = driver.findElement(By.xpath("//img[@id='pid8_thumb']"));

        WebElement berlin = driver.findElement(with(By.tagName("img")).below(NYC).above(sailor).toLeftOf(bayArea).toRightOf(boston));
        berlin.click();

        //Relative locator’larin dogru calistigini test edin
        String actuelId = berlin.getAttribute("id");
        System.out.println("actuelId = " + actuelId);
        String expectedId = "pid7_thumb";

        if(actuelId.equals(expectedId)){
            System.out.println("test gecti");
        }else System.out.println("test kaldi");
        driver.close();

    }
}
