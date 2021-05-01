package utestreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpStep3Page {
    public static final Target NEXT_BUTTON = Target.the("button that shows us the next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
