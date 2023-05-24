Feature: Order a SIM through business shop
  Scenario Outline: User orders a SIM through businessshop
    Given user is on Business shop Homepage
    When user hovers on shop and clicks on SimOnly
    Then user is navigated to the Simo page and selects <SimoContractTerm>
    Then user clicks on the <Serialno> "<SimoTariff>" and clicks on continue button
    Then user clicks on FourG or FiveG Sim "<FourG_FiveGSIMO>"
    Then user is navigated to the Extras page and selects spend cap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then user is navigated to Business apps page and select the business app and clicks on next button
    Then user lands on Review basket page and clicks on proceed button
    Then user selects new or existing customer button
    Then user enter all Details
    Then user clicks on order button and get the order number for sim

    Examples:
      |Scenario_Id |Serialno    |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
      |TC_206      |4           |24              |50GB      |5G             |YES               |5                |