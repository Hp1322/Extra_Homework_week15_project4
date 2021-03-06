package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on nextStepButton "+ nextStepButton.toString());
    }
    public void selectLengthOfStay(String moreOrLess){

        switch (moreOrLess){
            case "6 months or less" :
                clickOnElement(lessThanSixMonths);
                log.info("Selecting option "+moreOrLess+" from dropdown "+lessThanSixMonths.toString());
                break;
            case "longer than 6 months" :
                clickOnElement(moreThanSixMonths);
                log.info("Selecting option "+moreOrLess+" from dropdown "+moreThanSixMonths.toString());
                break;
        }
    }
}
