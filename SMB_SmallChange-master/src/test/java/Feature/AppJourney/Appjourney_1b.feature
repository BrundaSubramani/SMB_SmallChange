Feature: Order an app through business shop
  Scenario Outline: Customer orders McAfee Multi Access app through businessshop
    Given Customer is able to launch the online shop
    Then Customer selects the "<Scenario_ID>" "<app>"
    Then Customer can choose the "<quantity>" and click on chose button
    Then Customer lands on review basket page and clicks on proceed to order button
    Then customer click Existing customer button
    Then customer fills all the details in the form
    Then Customer click on order button

    Examples:
      |Scenario_ID   | app                            |quantity|
      |TC_301 TC_304 | McAfee Multi Access            |2       |