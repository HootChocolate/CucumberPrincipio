package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/passagem_aerea.feature",
		glue = "steps",
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)
public class RunnerPassagensAereas {

}
