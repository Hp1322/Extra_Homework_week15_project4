
Feature: Visa confirmation functionality
  As a user, i would like to check visa confirmation functionality of home office website

  Scenario: Verify an Australian Come Into UK For Tourism

    Given I am on startPage
    When I click on startnow button
    And I select nationality "Australia" aus
    And I click on next step button
    And I select reason for visit "Tourism" for aus
    And I click on next step button
    Then I should be able to see message "You will not need a visa to come to the UK" for australia


  Scenario: Verify a Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months

    Given I am on startPage
    When I click on startnow button
    And I select nationality "Chile" chile
    And I click on next step button
    And I select reason for visit "work" for chile
    And I click on next step button
    And I select lenth of stay "longer than 6 months"
    And I click on next step button for duration
    And I select job type "Health and care professional"
    And I click on next step button for job
    Then I should be able to see message "You need a visa to work in health and care" for chile

  Scenario: Verify a Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10O r20 Card

    Given I am on startPage
    When I click on startnow button
    And I select nationality "Colombia" colombia
    And I click on next step button
    And I select reason for visit "family" for colombia
    And I click on next step button
    And I select immigration status "Yes"
    And I click on next step button for stay
    Then I should be able to see message "You’ll need a visa to join your family or partner in the UK" for colombia
