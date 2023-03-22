package day01_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {

        // https://www.amazon.com/ adresine gidin
        // Kaynak Kodlarini konsola yazdiriniz
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        // sayfayi kapatiniz

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        //tam ekran yapalim
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");


        // Kaynak Kodlarini konsola yazdiriniz
        String kaynakKodlar = driver.getPageSource();
        System.out.println("Kaynak Kodlari = " + kaynakKodlar);

        System.out.println();

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if(kaynakKodlar.contains("Gateway")){
            System.out.println("Kaynak Kodlari 'Gateway' iceriyor");
        }else System.out.println("Kaynak Kodlari 'Gateway' ICERMIYOR");

        // sayfayi kapatiniz
        driver.close();
    }
}
