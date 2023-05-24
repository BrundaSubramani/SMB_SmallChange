Feature:feature002
  Scenario Outline: to verify user is able to perform STAC E2E journey
    Given USer is on sales force home page on web "<browser>"
    When User enter User Name "<username>" and password "<Password>" and click enter button and home page is displayed
    Then User click on contacts button
    Then user clicks on the contact name
    Then User click on manage External user and then click login to the portal as a user
    Then User modifies the url of the page and clicks enter
    Then User is navigated to My O2 business page and hovers on manage contracts and clicks on Thinking of switching from O2? (1 to 24 numbers)
    Then User is navigated to the search page and clicks on search
    Then User can see the multiple MPN and selects the MPN and clicks on continue
    Then user checks the stac checkbox and clicks on review your request
    Then user is navigated to submit page and submits the request
    Then user copies the service request number



    Examples:
      |Scenario_ID                                         | browser | username                                      | Password |
      |TC_30 TC_34 TC_78 TC_98 TC_102 TC_103 TC_233 TC_234 |chrome   |ritheshchandra.gudimalla@nttdata.com.csupreprod|Test@9999 |