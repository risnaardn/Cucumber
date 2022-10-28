package com.juaracoding.cucumber.step_definitions;


import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {
    WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu Recruitment")
    public void user_click_menu_recruitment() {
        Hooks.delay(1);
        recruitmentPage.menuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menu Recruitment");
    }

    @And("User on menu Recruitment")
    public void user_on_menu_recruitment() {
        extentTest.log(LogStatus.PASS, "User on menu Recruitment");
    }

    @And("User click Hiring by manager")
    public void user_click_hiring_by_manager() {
        Hooks.delay(1);
        recruitmentPage.searchByHiringManager();
        Assert.assertTrue(recruitmentPage.getTxtLinda().contains("Linda"));
        extentTest.log(LogStatus.PASS, "User click Hiring by manager");
    }

    @Then("User click Button Search")
    public void user_click_button_search() {
        recruitmentPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click Button Search");
    }


}
