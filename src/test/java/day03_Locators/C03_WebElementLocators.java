package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_WebElementLocators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

//        Bir class oluşturun : AmazonSearchTest
//        Main method oluşturun ve aşağıdaki görevi tamamlayın.
//                a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");

//                b.Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

//                c.Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //sonuc yazisi
        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Sonuc Yazisi = " + sonucYazisi.get(0).getText());

        //sonuc sayisi
        String [] sonucSayisi = sonucYazisi.get(0).getText().split(" ");
        System.out.println("sonuc Sayisi = " + sonucSayisi[2]);

//                d.Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> sonuclar = driver.findElements(By.className("s-image"));
        sonuclar.get(0).click();

        Thread.sleep(4000);

        driver.close();







    }
}
