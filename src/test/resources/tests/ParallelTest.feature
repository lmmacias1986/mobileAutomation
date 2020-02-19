Feature: Tip calculator should is displayed
    We want to verify if the form is displayed correctly

    Scenario: Verify if the button is displayed
        Given Open the app
        Then button is displayed

    Scenario: Calculate a tip amount for 10 bucks
        Given Open the app
        When set a value of 10 bucks
        And click calculate button
        Then validate tip value should be $1.50
