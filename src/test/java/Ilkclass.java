import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ilkclass {
    public static void main(String[] args) {

        ChromeOptions ops = new ChromeOptions();

        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops) ;

        driver.get("https://www.techproeducation.com");
        System.out.println("Title = " + driver.getTitle());
        System.out.println("Url = " + driver.getCurrentUrl());
    }
}
