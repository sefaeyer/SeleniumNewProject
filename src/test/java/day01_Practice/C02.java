package day01_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        // Pencereyi maximize yapiniz
        // "https://teknosa.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        // "https://medunna.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        // teknosa adresine geri donunuz
        // Sayfayı yenileyiniz
        // medunna adresine ilerleyiniz
        // Sayfayı yenileyiniz
        // pencereyi kapat

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String teknosaTitle = driver.getTitle();
        System.out.println("Teknosa Title = " + teknosaTitle);

        String teknosaUrl = driver.getCurrentUrl();
        System.out.println("Teknosa Url = " + teknosaUrl);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if(teknosaTitle.contains("Teknoloji")){
            System.out.println("Teknoloji kelimesi VAR");
        }else System.out.println("YOK");


        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if(teknosaUrl.contains("teknosa")){
            System.out.println("URL 'teknosa' iceriyor ");
        }else System.out.println("URL 'teknosa' icermiyor");

        Thread.sleep(2500);

        // "https://medunna.com/" adresine gidiniz
        driver.navigate().to("https://medunna.com/");
        Thread.sleep(2500);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitle = driver.getTitle();
        System.out.println("Medunna Title = " + medunnaTitle);

        String medunnaUrl = driver.getCurrentUrl();
        System.out.println("Medunna Url = " + medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if(medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title MEDUNNA iceriyor");
        }else System.out.println("Title MEDUNNA icermiyor");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if(medunnaUrl.contains("medunna")){
            System.out.println("URL medunna iceriyor");
        }
        Thread.sleep(2500);

        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2500);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2500);

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2500);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2500);

        // pencereyi kapat
        driver.close();



    }
}
