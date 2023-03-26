package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();
        Thread.sleep(2000);

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //Delete tusuna basin
        Thread.sleep(2000);
        deleteButton.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElemet = driver.findElement(By.cssSelector("h3"));
        System.out.println("addRemoveElemet.isDisplayed() = " + addRemoveElemet.isDisplayed());
        //Xpath ile

        //sayfayi kapat
        driver.close();

        /*
        Xpath ile cssSelector arasindaki farklar
            -Xpath metin ile calisabilir, cssSelector calisamaz
            -Xpath daha fazla kombinasyona sahiptir ve index e gore arama yapabilir
            -CssSelector index e gore arama yapamaz ancak daha hizli calisir

         */

    }
}
