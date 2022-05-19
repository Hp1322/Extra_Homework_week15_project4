package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yesButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement noButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on nextStepButton "+ nextStepButton.toString());
    }

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "Yes":
                clickOnElement(yesButton);
                log.info("Selecting option "+status+" from dropdown "+yesButton.toString());
                break;
            case "No":
                clickOnElement(noButton);
                log.info("Selecting option "+status+" from dropdown "+noButton.toString());
                break;
        }
    }
}
