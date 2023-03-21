package day02_DriverMethods;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //NOT: sayfadaki her bir web element i icin max 20 saniye bekler
        driver.get("https://youtube.com");

        //-> Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        //      eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        String actualTitle = driver.getTitle();//gercek baslik
        String expectedTitle = "youtube";//beklenen baslik

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED, Gercek Baslik: "+actualTitle);
        }

        //-> Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";

        if(actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED, Gercek Url: "+ actualUrl);

        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        //Youtube sayfasina geri donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.manage().window().setSize(new Dimension(800,800));
        driver.navigate().refresh();
        //Amazon sayfasina donun
        driver.manage().window().maximize();
        driver.navigate().forward();
        //Sayfayi tamsayfa yapin
        //--> PASSES -->  driver.manage().window().fullscreen();
        //-> Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle2 = driver.getTitle();
        String istenenKelime = "Amazon";
        if(actualTitle2.contains(istenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED, Gercek Baslik: "+actualTitle2);

        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String gercekUrl = driver.getCurrentUrl();
        String istenenUrl = "https://www.amazon.com/";
        if(gercekUrl.equals(istenenUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED, Gercek URL: "+gercekUrl);

        //Sayfayi kapatin
        driver.close();



    }
}
