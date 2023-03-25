package day03_Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

        //amazon sayfasina gidin
        driver.get("https://amazon.com");

        //"city bike" aramasi yapin
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        //arama sonuc metnini yazdir
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramaSonucu = " + aramaSonucu.get(0).getText());

        //sonuc sayisini yazdir
        String sonucSayisi = aramaSonucu.get(0).getText().split(" ")[2];
        System.out.println("sonucSayisi = " + sonucSayisi);

        //sonuc sayisini LAMBDA ile yazdirin
        Arrays.stream(aramaSonucu.get(0).getText().split(" ")).skip(2).limit(1).forEach(System.out::println);

        //Cikan ilk sonucun resmine tiklayin
        List<WebElement> urunResimler = driver.findElements(By.className("s-image"));
        urunResimler.get(0).click();

        //Sayfayi kapatin
       // driver.close();



    }
}
