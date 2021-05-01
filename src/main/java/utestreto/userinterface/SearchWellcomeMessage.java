package utestreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchWellcomeMessage {
    //public static  final Target WELLCOME_MESSAGE = Target.the("Search wellcome message")
           //.located(By.xpath("//div[@class='image-box-header']//h1[contains(text(), 'Welcome to the world's largest community of freelance software testers!')]"));
    public static  final Target WELLCOME_MESSAGE = Target.the("Search wellcome message")
    .located(By.xpath("//div[@class='pull-right next-step']//a//span[contains(text(), 'Complete Setup')]"));

}
