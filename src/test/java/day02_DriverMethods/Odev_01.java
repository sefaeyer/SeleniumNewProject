package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Odev_01 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.get("https://www.youtube.com");

        driver.navigate().to("https://amazon.com");

        driver.navigate().back(); // youtube a geri gonderecek

        driver.navigate().forward(); // amazon sayfasina geri gidecek

        driver.navigate().refresh(); // amazon sayfasini yenileyecek

        driver.close(); // tum sekmeler icin driver.quit() kullanilir.
    }
}
