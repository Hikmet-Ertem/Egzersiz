package utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
public abstract class TestBase {
    protected WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterClass
    public void teardown(){
        driver.close();
        // public void tumSayfaScreenshot() throws IOException {
        //        TakesScreenshot tss=(TakesScreenshot) driver;
        //        String tarih=new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        //        File tumSayfa= new File("target/screenShot/tumSayfa"+tarih+".jpg");
        //        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        //        FileUtils.copyFile(geciciResim,tumSayfa);
        //    }

    }

}