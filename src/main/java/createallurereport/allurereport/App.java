package createallurereport.allurereport;

import io.qameta.allure.Step;

/**
 * Hello world!
 *
 */
public class App {
	@Step("First Step")
	public void step1() {

		System.out.println("First");
	}

	@Step("Second Step")
	public void step2() {

		System.out.println("Second");
	}
}
