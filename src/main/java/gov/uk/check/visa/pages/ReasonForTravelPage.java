package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement tourism;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAcademic;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartner;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//input[@type='radio']")
    List<WebElement> allTravel;

    public void reasonForTravel(String reason){
        int size = allTravel.size();

        for(int i = 0; i < size; i++) {
            String val = allTravel.get(i).getAttribute("value");
            if(val.equalsIgnoreCase(reason)){
                allTravel.get(i).click();
                break;
            }
        }
    }


    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on nextStepButton "+ nextStepButton.toString());
    }

    public void selectReasonForVisit(String reason) {
        if (reason == "Tourism") {
            clickOnElement(tourism);
            log.info("Selecting option "+reason+" from dropdown "+tourism.toString());
        } else if (reason == "Work, academic visit or business") {
            clickOnElement(workAcademic);
            log.info("Selecting option "+reason+" from dropdown "+workAcademic.toString());
        } else if (reason == "Join partner or family for a long stay") {
            clickOnElement(joinPartner);
            log.info("Selecting option "+reason+" from dropdown "+joinPartner.toString());
        }
    }


}

