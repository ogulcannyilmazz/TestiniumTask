package Sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfalar {
    public final String aramaKutusu ="[placeholder='Ürün, Marka Arayın']";

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
