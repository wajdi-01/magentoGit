package com.e2eTests.stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.e2e.lumaProject.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base {

	@Before
	public void runsBeforeAnyScenario() {

	}

	@After
	public void runsAfterAnyScenaruio(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");

		driver.quit();

	}
}
