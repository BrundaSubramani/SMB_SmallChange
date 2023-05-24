Feature:feature004
  Scenario Outline: to verify user is able to perform PAC E2E journey
    Given USER is on sales force home page on web "<browser>"
    When USER enter User Name "<username>" and password "<Password>" and click enter button and home page is displayed
    Then user click on contacts button
    Then clicks on the contact name
    Then user click on manage External user and then click login to the portal as a user
    Then USer modifies the url of the page and clicks enter
    Then user navigates to MyO2 business page and hovers on manage devices and clicks on Sim swap
    Then USer is navigated to the search page and clicks on search
    Then USer can see the multiple MPN and selects the MPN and clicks on continue
    Then user providesd the unique sim number and clicks on continue
    Then User is navigated to the security check page and selects the phone number from the dropdown
    Then User clicks on send code
    Then User opens a new tab and enters receive sms online and clicks on search
    Then User opens the webpage and search for the specific MPN
    Then User copies the OTP and paste it in the enter you code text box and clicks on verify



    Examples:
      |Scenario_ID                                         | browser | username                       | Password |
      |TC_30 TC_34 TC_78 TC_98 TC_102 TC_103 TC_233 TC_234 |chrome   |brunda.s1@nttdata.com.csupreprod|july@123  |