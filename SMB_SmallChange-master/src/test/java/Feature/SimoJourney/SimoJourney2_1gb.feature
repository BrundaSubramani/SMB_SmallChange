Feature: Order a SIM through business shop
  Scenario Outline: User orders a SIM through businessshop
    Given user is on business shop home page
    When user hovers on shop and clicks on Sim Only
    Then user is navigated to the Simo page and selects the <SimoContractTerm>
    Then user clicks on the <Serialno> "<SimoTariff>" and clicks on continue
    Then user clicks on FourG or FiveG Simo "<FourG_FiveGSIMO>"
    Then user is navigated to the extras page and selects spend cap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then user is navigated to business apps page and select the business app and clicks on next button
    Then user lands on review basket page and clicks on proceed button
    Then user selects either new or existing customer button
    Then user enter all details
    Then user click on order button and get the order number for sim

    Examples:
      |Scenario_Id |Serialno    |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
      |TC_25       |2           |12              |1GB       |5G             |YES               |5                |