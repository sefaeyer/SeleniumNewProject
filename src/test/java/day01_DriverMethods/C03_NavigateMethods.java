package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03_NavigateMethods {
    static ChromeOptions options;
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        //amazon sayfasina gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000);

        //sonra techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");//get methodu ile ayni sekilde calisir
        Thread.sleep(3000);

        //techpro sayfa basligini konsola yazdiralim
        System.out.println("Title = " + driver.getTitle());
        Thread.sleep(3000);

        //tekrar amazon sayfasina don
        driver.navigate().back(); // geri doner
        Thread.sleep(3000);

        //amazon sayfa basligini yazdir
        System.out.println("Title( = " + driver.getTitle());
        Thread.sleep(3000);

        //tekrar techpro sayfasina geri git
        driver.navigate().forward();
        Thread.sleep(3000);

        //son olarak sayfayi yenileyelim ve sayfayi kapatalim
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();//driver i kapatir
        //NOT gecisler yavas olsun diye 3 sn bekletelim



    }
}
