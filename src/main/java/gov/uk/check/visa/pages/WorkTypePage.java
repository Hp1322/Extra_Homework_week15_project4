package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    public WorkTypePage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthAndCare;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement digitalTechnology;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicOrResearcher;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement workInArts;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement professionalSportsPerson;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousWorker;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement iWantToStartABusiness;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement iWantToDoAnotherTypeOfJob;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on nextStepButton "+ nextStepButton.toString());
    }


    public void selectJobType(String job) {
        switch (job) {
            case "Health and care professional":
                clickOnElement(healthAndCare);
                log.info("Selecting job "+job+" from dropdown "+healthAndCare.toString() );
                break;
            case "Digital technology professional":
                clickOnElement(digitalTechnology);
                log.info("Selecting job "+job+" from dropdown "+digitalTechnology.toString() );
                break;
            case "Academic or researcher":
                clickOnElement(academicOrResearcher);
                log.info("Selecting job "+job+" from dropdown "+academicOrResearcher.toString() );
                break;
            case "Work in arts or culture":
                clickOnElement(workInArts);
                log.info("Selecting job "+job+" from dropdown "+workInArts.toString() );
                break;
            case "Professional sportsperson":
                clickOnElement(professionalSportsPerson);
                log.info("Selecting job "+job+" from dropdown "+professionalSportsPerson.toString() );
                break;
            case "Religious worker":
                clickOnElement(religiousWorker);
                log.info("Selecting job "+job+" from dropdown "+religiousWorker.toString() );
                break;
            case "I want to start a business":
                clickOnElement(iWantToStartABusiness);
                log.info("Selecting job "+job+" from dropdown "+iWantToStartABusiness.toString() );
                break;
            case "I want to do another type of job - show me other work visas":
                clickOnElement(iWantToDoAnotherTypeOfJob);
                log.info("Selecting job "+job+" from dropdown "+iWantToDoAnotherTypeOfJob.toString() );
                break;
        }
    }
}
