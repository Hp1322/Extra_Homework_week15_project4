$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("visaconfirmation.feature");
formatter.feature({
  "line": 2,
  "name": "Visa confirmation functionality",
  "description": "As a user, i would like to check visa confirmation functionality of home office website",
  "id": "visa-confirmation-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9566190600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify an Australian Come Into UK For Tourism",
  "description": "",
  "id": "visa-confirmation-functionality;verify-an-australian-come-into-uk-for-tourism",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on startPage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on startnow button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select nationality \"Australia\" aus",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on next step button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select reason for visit \"Tourism\" for aus",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on next step button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see message \"You will not need a visa to come to the UK\" for australia",
  "keyword": "Then "
});
formatter.match({
  "location": "VisaConfirmationTest.iAmOnStartPage()"
});
formatter.result({
  "duration": 371407300,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnStartnowButton()"
});
formatter.result({
  "duration": 367863800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 22
    }
  ],
  "location": "VisaConfirmationTest.iSelectNationalityAus(String)"
});
formatter.result({
  "duration": 139618000,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButton()"
});
formatter.result({
  "duration": 5065092600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tourism",
      "offset": 27
    }
  ],
  "location": "VisaConfirmationTest.iSelectReasonForVisitForAus(String)"
});
formatter.result({
  "duration": 108962100,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButton()"
});
formatter.result({
  "duration": 8403912300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You will not need a visa to come to the UK",
      "offset": 33
    }
  ],
  "location": "VisaConfirmationTest.iShouldBeAbleToSeeMessageForAustralia(String)"
});
formatter.result({
  "duration": 42522000,
  "status": "passed"
});
formatter.after({
  "duration": 88600,
  "status": "passed"
});
formatter.before({
  "duration": 4430449300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify a Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months",
  "description": "",
  "id": "visa-confirmation-functionality;verify-a-chilean-coming-to-the-uk-for-work-and-plans-on-staying-for-longer-than-six-months",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I am on startPage",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on startnow button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I select nationality \"Chile\" chile",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on next step button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select reason for visit \"work\" for chile",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on next step button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select lenth of stay \"longer than 6 months\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on next step button for duration",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select job type \"Health and care professional\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on next step button for job",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I should be able to see message \"You need a visa to work in health and care\" for chile",
  "keyword": "Then "
});
formatter.match({
  "location": "VisaConfirmationTest.iAmOnStartPage()"
});
formatter.result({
  "duration": 28800,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnStartnowButton()"
});
formatter.result({
  "duration": 200510000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chile",
      "offset": 22
    }
  ],
  "location": "VisaConfirmationTest.iSelectNationalityChile(String)"
});
formatter.result({
  "duration": 72693600,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButton()"
});
formatter.result({
  "duration": 13233822100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "work",
      "offset": 27
    }
  ],
  "location": "VisaConfirmationTest.iSelectReasonForVisitForChile(String)"
});
formatter.result({
  "duration": 173726800,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButton()"
});
formatter.result({
  "duration": 1092912400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "longer than 6 months",
      "offset": 24
    }
  ],
  "location": "VisaConfirmationTest.iSelectLenthOfStay(String)"
});
formatter.result({
  "duration": 102490800,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButtonForDuration()"
});
formatter.result({
  "duration": 455048800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Health and care professional",
      "offset": 19
    }
  ],
  "location": "VisaConfirmationTest.iSelectJobType(String)"
});
formatter.result({
  "duration": 176775700,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButtonForJob()"
});
formatter.result({
  "duration": 2597746500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You need a visa to work in health and care",
      "offset": 33
    }
  ],
  "location": "VisaConfirmationTest.iShouldBeAbleToSeeMessageForChile(String)"
});
formatter.result({
  "duration": 82860700,
  "status": "passed"
});
formatter.after({
  "duration": 70600,
  "status": "passed"
});
formatter.before({
  "duration": 6060847000,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify a Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10O r20 Card",
  "description": "",
  "id": "visa-confirmation-functionality;verify-a-columbian-national-coming-to-the-uk-to-join-a-partner-for-a-long-stay-they-do-have-an-article-10o-r20-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "I am on startPage",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I click on startnow button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I select nationality \"Colombia\" colombia",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click on next step button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I select reason for visit \"family\" for colombia",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on next step button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select immigration status \"Yes\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on next step button for stay",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should be able to see message \"You’ll need a visa to join your family or partner in the UK\" for colombia",
  "keyword": "Then "
});
formatter.match({
  "location": "VisaConfirmationTest.iAmOnStartPage()"
});
formatter.result({
  "duration": 46500,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnStartnowButton()"
});
formatter.result({
  "duration": 485920000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Colombia",
      "offset": 22
    }
  ],
  "location": "VisaConfirmationTest.iSelectNationalityColombia(String)"
});
formatter.result({
  "duration": 159773500,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButton()"
});
formatter.result({
  "duration": 7647158900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "family",
      "offset": 27
    }
  ],
  "location": "VisaConfirmationTest.iSelectReasonForVisitForColombia(String)"
});
formatter.result({
  "duration": 248574200,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButton()"
});
formatter.result({
  "duration": 7104476600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 29
    }
  ],
  "location": "VisaConfirmationTest.iSelectImmigrationStatus(String)"
});
formatter.result({
  "duration": 115964600,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationTest.iClickOnNextStepButtonForStay()"
});
formatter.result({
  "duration": 964049600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You’ll need a visa to join your family or partner in the UK",
      "offset": 33
    }
  ],
  "location": "VisaConfirmationTest.iShouldBeAbleToSeeMessageForColombia(String)"
});
formatter.result({
  "duration": 90543800,
  "status": "passed"
});
formatter.after({
  "duration": 108300,
  "status": "passed"
});
});