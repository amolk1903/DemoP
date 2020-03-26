package testpackage;

import org.testng.annotations.Test;

import createallurereport.allurereport.App;
import io.qameta.allure.Description;

public class TestClass {

	App app = new App();

	@Test(priority = 0, description = "Demo Test")
	@Description("This is just a demo test for allure reports")
	public void test() {
		app.step1();
		app.step2();
	}
	
	@Test(priority = 1, description = "New Demo Test")
	@Description("The New Demo Test For Allure Reports")
	public void test2() {
		
		app.step2();
		app.step1();
	}
}
