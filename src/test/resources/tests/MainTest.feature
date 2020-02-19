Feature: Tip calculator should work
    we want to calculate the total amount of the bill

    Scenario Outline: Calculate a total amount for 10 bucks
        Given Open the app
        When set a value of <arg> bucks
        And click calculate button
        Then validate total should be <total>
        Examples:
            | arg | total  |
            | 10  | $11.50 |
            | 20  | $23.00 |
            | 30  | $34.50 |
            | 40  | $46.00 |
