Feature: CF Device Journey

  Scenario Outline: Customer is able to proceed with Device Journey and placing order
    Given Customer is on online business home page
    When Customer hover over shop and clicks on All phones icon and filters iphone products
    Then Customer is navigated to Business Mobile Phones webpage and selects <Serialno> "<DevName>"
    Then Customer is navigated to phone description page and selects <Serialno> <memory> and clicks on view all tarrifs
    Then Customer is navigated to tarrifs and extras page and select the required "<Tariff>" "<plan>"
    Then Customer select Bolt ons and clicks on Go to basket button
    Then Customer is on review your basket page and clicks on proceed to order button
    Then Customer clicks on existing cutomer
    Then Customer navigated to order page and enter the details
    Then Customer selects upgrading or adding and clicks on the checkbox
    Then Customer clicks the order button and get the order number

    Examples:
      |Scenario_id|Serialno   | DevName            | memory | plan  | Tariff  |
      |TC_177     |1          |iphone 12 pro Max 5G|512     |3GB    |24 months|