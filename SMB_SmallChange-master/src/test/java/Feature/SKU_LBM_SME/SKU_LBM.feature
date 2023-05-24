Feature: Feature004
  Scenario Outline:verify User is able to login as sales rep successfully
    Given User is on sales force home page on web
    When user enter Username "<username>" and password "<Password>" and click enter button and home page is displayed
    Then User navigates to search box and search for ben myres LBM and click on search button
    Then User logins to the Ben Myres LBM profile
    Then user search for sales rep "<SKU>" and click search button
    Then user click on "<commerical>" product
    Then user can see the product details


    Examples:
      |Scenario_Id |browser  |         Username                              |  Password       |SKU       |commerical                             |colour  |
      |BSBC-1234   |chrome   |brunda.s1@nttdata.com.csupreprod               | brunda@123       |MND03B/A  | iPhone 13 Pro Max 256GB Alpine Green |#596758 |
