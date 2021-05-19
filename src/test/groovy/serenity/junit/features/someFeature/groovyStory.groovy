package serenity.junit.features.someFeature

import net.serenitybdd.junit.runners.SerenityRunner
import net.thucydides.core.annotations.Managed
import net.thucydides.core.annotations.Steps
import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver
import serenity.junit.steps.serenity.EndUserSteps

@RunWith(SerenityRunner.class)
class groovyStory {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public EndUserSteps anna;

	@Test
	void shouldFail() {
		anna.is_the_home_page();
		anna.looks_for("apple");
		anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
	}

	@Test
	void shouldPass() {
		assert true
	}
}
