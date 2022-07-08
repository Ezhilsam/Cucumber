Feature: Verifying AdactinHotel details

Scenario: Verifying AdactinHotel login details with valid credentials

Given user is on the AdactinHotel page
When user should enter username and password
And user should click the login button
Then user should verify sucess message
