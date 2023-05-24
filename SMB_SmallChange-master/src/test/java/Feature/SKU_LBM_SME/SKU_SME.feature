Feature: Feature004
  Scenario Outline:verify User is able to login as sales rep successfully
    Given User is on salesforce home page on web
    When user enter Username "<username>" and Password "<Password>" and click enter button and home page is displayed
    Then User navigates to search box and search for Ben myres SME and click on search button
    Then User logins to the BenMyres SME profile
    Then User search for sales rep "<SKU>" and clicks search button
    Then User clicks on "<commerical>" product
    Then user can see the Product details

  Examples:
  |Scenario_Id |browser  |         Username                              |  Password       |SKU       |commerical                             |colour  |
  |BSBC-1234   |chrome   |brunda.s1@nttdata.com.csupreprod               | brunda@123       |MND03B/A  | iPhone 13 Pro Max 256GB Alpine Green |#596758 |