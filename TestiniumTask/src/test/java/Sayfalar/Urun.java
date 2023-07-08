package Sayfalar;

import org.openqa.selenium.WebDriver;

public class Urun extends Sayfalar {
    public final String urunBedeni= ".m-variation > span:nth-of-type(3)";
    public final String sepeteEkle= "addBasket";
    public final String sepeteGit= ".bwi-cart-o > .o-header__userInfo--text";

    public Urun(WebDriver driver) {
        super(driver);
    }
}
