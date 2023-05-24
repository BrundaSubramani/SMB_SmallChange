Feature: feature008
  Scenario Outline: Customer is able to proceed with Simo Journey
    Given customer is on Businessshop home page
    When Customer hovers on the shop and clicks on SimOnly
    Then Customer is navigated to the Simo page and selects contract term "<SimoContractTerm>" and tariff plan "<SimoTariff>"
    Then Customer selects  "<FourG_FiveGSIMO>"
    Then Customer is navigated to extras page and selects required "<SIMOSpendCapSelect>" and "<SIMOSpendCapValue>"and clicks on next button
    Then Customer is navigated to business apps page and selects business app and clicks on next button
    Then customer lands on Review basket page and clicks on proceed  button
    Then Customer fills the form and can see the Order number

    Examples:
      |Scenario_ID |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
      |TC_135      |12              |6GB       |4G             |YES               |10               |