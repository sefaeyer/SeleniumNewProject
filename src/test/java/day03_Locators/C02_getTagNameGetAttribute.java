package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_getTagNameGetAttribute {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));


//        1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
//        2- arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if(actualTagName.equals(expectedTagName)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

//        3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute = "field-keywords";
        if(actualAttribute.equals(expectedAttribute)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");



    }
}
