Feature: Order an app through business shop
  Scenario Outline: Customer orders a Microsoft 365 app through business shop
    Given customer is able to launch the Business shop
    Then customer selects the "<Scenario_ID>" "<app>"
    Then customer can choose the "<quantity>" and click on chose button
    Then customer lands on review basket page and clicks on proceed to order button
    Then Customer click Existing customer button
    Then Customer fills all the details in the form
    Then customer click on order button

    Examples:
      |Scenario_ID   | app                            |quantity|
      |TC_283 TC_298 | Microsoft 365                  |9       |