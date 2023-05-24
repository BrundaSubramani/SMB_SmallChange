Feature: Order a SIM through business shop
  Scenario Outline: Customer orders a SIM through businessshop
    Given Customer is on business shop homepage
    When Customer hovers on shop and clicks on Sim Only
    Then Customer is navigated to the Simo page and selects the <SimoContractTerm>
    Then Customer clicks on the <Serialno> "<SimoTariff>" and clicks on continue
    Then Customer clicks on FourG or FiveG Simo "<FourG_FiveGSIMO>"
    Then Customer is navigated to the extras page and selects spend cap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then Customer is navigated to business apps page and select the business app and clicks on next button
    Then Customer lands on review basket page and clicks on proceed button
    Then Customer selects either new or existing customer button
    Then Customer enter all details "<email>"
    Then Customer click on order button and get the order number for sim

    Examples:
      |Scenario_Id  |Serialno | SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|email            |
      |TC_74        |1        |12               |6GB       |5G             |NO                 |10              |Test@yopmail.com |
