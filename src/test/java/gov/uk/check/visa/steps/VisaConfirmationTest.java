package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;

public class VisaConfirmationTest {
    @Given("^I am on startPage$")
    public void iAmOnStartPage() {
    }

    @When("^I click on startnow button$")
    public void iClickOnStartnowButton() {
        new StartPage().clickStartNow();
    }

    @And("^I select nationality \"([^\"]*)\" aus$")
    public void iSelectNationalityAus(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^I click on next step button$")
    public void iClickOnNextStepButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^I select reason for visit \"([^\"]*)\" for aus$")
    public void iSelectReasonForVisitForAus(String reason) {
        new ReasonForTravelPage().reasonForTravel(reason);
    }

    @Then("^I should be able to see message \"([^\"]*)\" for australia$")
    public void iShouldBeAbleToSeeMessageForAustralia(String text) {
        new ResultPage().confirmResultMessage(text);
    }

    @And("^I select nationality \"([^\"]*)\" chile$")
    public void iSelectNationalityChile(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^I select reason for visit \"([^\"]*)\" for chile$")
    public void iSelectReasonForVisitForChile(String reason) {
        new ReasonForTravelPage().reasonForTravel(reason);

    }

    @And("^I select lenth of stay \"([^\"]*)\"$")
    public void iSelectLenthOfStay(String stay) {
        new DurationOfStayPage().selectLengthOfStay(stay);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String job) {
        new WorkTypePage().selectJobType(job);
    }

    @Then("^I should be able to see message \"([^\"]*)\" for chile$")
    public void iShouldBeAbleToSeeMessageForChile(String text) {
        new ResultPage().confirmResultMessage(text);
    }

    @And("^I select nationality \"([^\"]*)\" colombia$")
    public void iSelectNationalityColombia(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^I select reason for visit \"([^\"]*)\" for colombia$")
    public void iSelectReasonForVisitForColombia(String reason) {
        new ReasonForTravelPage().reasonForTravel(reason);
    }

    @And("^I select immigration status \"([^\"]*)\"$")
    public void iSelectImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }

    @Then("^I should be able to see message \"([^\"]*)\" for colombia$")
    public void iShouldBeAbleToSeeMessageForColombia(String text) {
        new ResultPage().confirmResultMessage(text);
    }

    @And("^I click on next step button for duration$")
    public void iClickOnNextStepButtonForDuration() {
        new DurationOfStayPage().clickNextStepButton();
    }

    @And("^I click on next step button for job$")
    public void iClickOnNextStepButtonForJob() {
        new WorkTypePage().clickNextStepButton();
    }

    @And("^I click on next step button for stay$")
    public void iClickOnNextStepButtonForStay() {
        new FamilyImmigrationStatusPage().clickNextStepButton();
    }
}
