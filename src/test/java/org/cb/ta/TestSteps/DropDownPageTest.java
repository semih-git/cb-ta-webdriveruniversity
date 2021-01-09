package org.cb.ta.TestSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class DropDownPageTest {

    @Given("User is on drop down page")
    public void userIsOnDropDownPage() {
        System.out.println("test1 run oleyy");
    }

    @When("Select one of the programming language from the first drop down menu")
    public void selectOneOfTheProgrammingLanguageFromTheFirstDropDownMenu() {
        assertTrue(true);
    }

    @And("Select one of the toll from the second drop down menu")
    public void selectOneOfTheTollFromTheSecondDropDownMenu() {
        assertTrue(true);
    }

    @And("Select one of the toll from the third drop down menu")
    public void selectOneOfTheTollFromTheThirdDropDownMenu() {
        assertTrue(true);
    }

    @Then("User Selects")
    public void userSelects() {
        assertTrue(true);
    }
}
