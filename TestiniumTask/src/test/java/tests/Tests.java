package tests;

import Sayfalar.AnaSayfa;
import Sayfalar.SepetSayfasi;
import Sayfalar.Urun;
import Sayfalar.UrunlerSayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Tests {
    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private Urun urun;
    private SepetSayfasi sepetSayfasi;
    private UrunlerSayfasi urunlerSayfasi;

    @BeforeEach
    void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa= new AnaSayfa(driver);
        urun= new Urun(driver);
        sepetSayfasi=new SepetSayfasi(driver);
        urunlerSayfasi=new UrunlerSayfasi(driver);
    }
    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/ogulcanyilmaz/Downloads/chromedriver_mac64/chromedriver");
    }
    @Test
    void testiniumTest() throws InterruptedException {
        driver.get("https://www.beymen.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20L));

        anaSayfa.elementBekleme(anaSayfa.aramaKutusu);
        anaSayfa.kelimeYazma(anaSayfa.aramaKutusu,"şort");
        anaSayfa.kelimeYazma(anaSayfa.aramaKutusu,String.valueOf(Keys.CONTROL+"a"));
        anaSayfa.kelimeYazma(anaSayfa.aramaKutusu, String.valueOf(Keys.DELETE));
        anaSayfa.kelimeYazma(anaSayfa.aramaKutusu,"gömlek");
        driver.findElement(By.cssSelector("[placeholder='Ürün, Marka Arayın']")).sendKeys(Keys.ENTER);

        urunlerSayfasi.elementBeklemePath(urunlerSayfasi.urunSec);
        urunlerSayfasi.tiklaPath(urunlerSayfasi.urunSec);

        urun.elementBekleme(urun.urunBedeni);
        urun.tiklaCss(urun.urunBedeni);
        urun.tiklaId(urun.sepeteEkle);
        urun.tiklaId(urun.sepeteEkle);
        urun.tiklaCss(urun.sepeteGit);

        sepetSayfasi.elementBekleme(sepetSayfasi.urunSil);
        sepetSayfasi.tiklaCss(sepetSayfasi.urunSil);
    }
    @AfterEach
    void tearDown(){
        driver.close();
    }

}
