Feature: CF Device Journey

  Scenario Outline: User is able to proceed with Device Journey and placing order
    Given user is on online business home page
    When user hover over shop and clicks on All phones icon and filters iphone products
    Then user is navigated to Business Mobile Phones webpage and selects <Serialno> "<DevName>"
    Then user is navigated to phone description page and selects <Serialno> "<memory>" and clicks on view all tarrifs
    Then user is navigated to tarrifs and extras page and select the required "<Tariff>" "<plan>"
    Then user select Bolt ons and clicks on Go to basket button
    Then user is on review your basket page and clicks on proceed to order button
    Then user clicks on existing cutomer
    Then user navigated to order page and enter the details
    Then user selects upgrading or adding and clicks on the checkbox
    Then clicks the order button and get the order number



    Examples:
      |Scenario_Id |Serialno   | DevName            |memory|Tariff |plan     |
      |TC_370      |4          |iPhone 12 5G        |256GB |20GB   |36 months|