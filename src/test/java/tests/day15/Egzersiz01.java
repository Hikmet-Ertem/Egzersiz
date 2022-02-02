package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utulities.TestBase;

import java.time.Duration;

public class Egzersiz01 extends TestBase {
    ////          1.soru :Turkce
    //    //web sitesine gidin: https://www.jqueryscript.net/demo/bootstrap-alert-box/
    //    // pencereyi büyüt
    //    // eylem diyalog düğmesine tıklayın
    //    // kullanmanız gerekiyorsa açıkça bekleyin
    //    // tamam butonuna tıklayın
    //    // iframe mesajını kabul et

    @Test
    public void test01(){
        ////  1.soru :Turkce
        //    //web sitesine gidin: https://www.jqueryscript.net/demo/bootstrap-alert-box/
        driver.get("https://www.jqueryscript.net/demo/bootstrap-alert-box/");
        //    // pencereyi büyüt
        driver.manage().window().maximize();
        //    // eylem diyalog düğmesine tıklayın
        driver.findElement(By.xpath("//button[@id='action']")).click();
        //    // kullanmanız gerekiyorsa açıkça bekleyin
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        //    // tamam butonuna tıklayın
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info btn-sm']"))).click();
        //    // iframe mesajını kabul et
        driver.switchTo().alert().accept();
    }
}