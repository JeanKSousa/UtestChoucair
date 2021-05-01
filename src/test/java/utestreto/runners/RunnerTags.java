package utestreto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utestReto.feature",
        tags = "@stories",
        glue = "utestreto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
