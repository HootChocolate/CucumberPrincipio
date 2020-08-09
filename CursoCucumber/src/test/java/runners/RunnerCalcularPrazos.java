package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		features = "src/test/resources/features/calculo_de_prazos.feature",
		glue = "steps",
		snippets = SnippetType.CAMELCASE
		)
public class RunnerCalcularPrazos {

}
