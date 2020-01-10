package tests;

import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;

public class TC_001_Verify_Message extends BaseTest {

	String Class_Name = this.getClass().getCanonicalName();

	@Test(priority = 1, description = "Valid Test Scenario")
	public void Valid_Test() throws Exception {

		String Test_Name = new Throwable().getStackTrace()[0].getMethodName();

		ExtentTestManager.startTest(Class_Name, Test_Name, "Valid Test Scenario.");

		Home.App_Launch("http://localhost:8090/mvn-hello-world/").Verify_Text("Welcome to");

	}

}