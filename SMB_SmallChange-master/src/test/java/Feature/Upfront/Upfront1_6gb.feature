Feature: Order a SIM through business shop
  Scenario Outline: User orders a SIM through businessshop
    Given User is on business shop home page
    When User hovers on shop and clicks on Sim Only
    Then User is navigated to the Simo page and selects the <SimoContractTerm>
    Then User clicks on the <Serialno> "<SimoTariff>" and clicks on continue
    Then User clicks on FourG or FiveG Simo "<FourG_FiveGSIMO>"
    Then User is navigated to the extras page and selects spend cap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then User is navigated to business apps page and select the business app and clicks on next button
    Then User lands on review basket page and clicks on proceed button
    Then User selects either new or existing customer button
    Then User enter all details
    Then User click on order button and get the order number for sim

    Examples:
      |Scenario_Id    |Serialno      |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
      |TC_37          |1             |12              |6GB       |4G             |NO                |                 |
