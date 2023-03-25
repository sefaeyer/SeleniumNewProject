package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_Xpath {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

        //                a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");

//                b.Search(ara) “city bike”

        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        aria-label="Search Amazon" spellcheck="false">
        xpath syntax:
                    //tag_name[@attributeName='attributeDegeri']
                    //input[@id='twotabsearchtextbox']
         */

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //--> Hybrid bikes xpath al
        //   (//*[@class='a-size-base a-color-base'])[10]
        //--> //*[text()='Hybrid Bikes']
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println("hybridBike.isDisplayed() = " + hybridBike.isDisplayed()); //we goruntuleniyor mu -> evet
        System.out.println("hybridBike.isEnabled() = " + hybridBike.isEnabled()); // we erisilebiliyor mu -> evet
        System.out.println("hybridBike.isSelected() = " + hybridBike.isSelected()); // we secilebiliyor mu -> hayir
        hybridBike.click();


        //sonuc sayisi yazdir
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='15 results for']"));
        String [] sonuc = sonucSayisi.getText().split(" ");
        System.out.println("sonuc = " + sonuc[0]);

    }
}
