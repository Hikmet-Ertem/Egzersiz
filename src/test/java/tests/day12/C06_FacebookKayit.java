package tests.day12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utulities.TestBase;

public class C06_FacebookKayit extends TestBase {

    @Test
    public void test01() {

        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        //4- Kaydol tusuna basalim




    }


}
