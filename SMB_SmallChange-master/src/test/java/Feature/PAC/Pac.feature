Feature:feature001
  Scenario Outline: to verify user is able to perform PAC E2E journey
    Given user is on sales force home page on web "<browser>"
    When I enter User Name "<username>" and password "<Password>" and click enter button and home page is displayed
    Then click on contacts button
    Then User clicks on the contact name
    Then click on manage External user and then click login to the portal as a user
    Then user modifies the url of the page and clicks enter
    Then user is navigated to My O2 business page and hovers on manage contracts and clicks on Thinking of switching from O2? (1 to 24 numbers)
    Then user is navigated to the search page and clicks on search
    Then user can see the multiple MPN and selects the MPN and clicks on continue
    Then user checks the pac checkbox and clicks on review your request
    Then user is navigated to the security check page and selects the phone number from the dropdown
    Then user clicks on send code
    Then user opens a new tab and enters receive sms online and clicks on search
    Then user opens the webpage and search for the specific MPN
    Then user copies the OTP and paste it in the enter you code text box and clicks on verify




    Examples:
      |Scenario_ID                                         | browser | username                       | Password |
      |TC_30 TC_34 TC_78 TC_98 TC_102 TC_103 TC_233 TC_234 |chrome   |brunda.s1@nttdata.com.csupreprod|july@123  |