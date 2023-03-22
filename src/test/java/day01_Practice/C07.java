package day01_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C07 {
    public static void main(String[] args) throws InterruptedException {
        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        //tam ekran yapalim
        driver.manage().window().maximize();

        //maximum bekleme suresi koy
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // arama motorunda nutella yazip aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella", Keys.ENTER);


        // sayfada kac tane link oldugunu bulunuz
        List<WebElement> linklerListesi =  driver.findElements(By.tagName("a"));

        System.out.println(linklerListesi.size());  // ONEMLI!!!

        Thread.sleep(900);

        // linkleri yazdiriniz
        int sayac = 1;

        for (WebElement each:linklerListesi) {
            System.out.println(sayac + " . link = " + each.getText());
            sayac++;
        }

        Thread.sleep(900);

        // pencereyi kapatiniz
        driver.close();

    }
}
