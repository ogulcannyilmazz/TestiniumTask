package Sayfalar;

import org.openqa.selenium.WebDriver;

public class UrunlerSayfasi extends Sayfalar{

        public final String urunSec="//div[@id='productList']//a[@href='/p_beymen-club-comfort-fit-haki-gomlek_1032696']//div[3]";

        public UrunlerSayfasi(WebDriver driver) {
            super(driver);
        }
    }

