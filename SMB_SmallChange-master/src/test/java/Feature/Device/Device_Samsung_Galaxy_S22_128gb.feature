Feature: Order a device through business shop

  Scenario Outline: Customer is able to add a device to basket through businessshop
    Given Customer did launch the businessshop
    Then navigates to phone section and selects device with name "<DevName>"
    Then Customer selects the "<memory>" variant and clicks on view tariff button
    Then Customer selects the "<term>" and Tariff
    Then Customer navigates to review basket page and clicks on proceed button

    Examples:
      |Scenario_Id | DevName                          |memory       |term     |
      |TC_130      |Samsung Galaxy S22           |128GB        |24 months|