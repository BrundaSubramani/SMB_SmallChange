Feature: Order a SIM through business shop
  Scenario Outline: Customer orders a SIM through businessshop
    Given customer is on Businessshop homepage
    When Customer hovers on Shop and clicks on SimOnly
    Then customer is navigated to the Sim page and selects the <SimoContractTerm>
    Then customer clicks the <Serialno> "<SimoTariff>" and clicks on continue button
    Then customer clicks on fourG or FiveG Sim "<FourG_FiveGSIMO>"
    Then customer is navigated to the Extraspage and selects spendcap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then customer is navigated to Business apps page and select the business app and clicks on next button
    Then customer lands on Review basket Page and clicks on proceed button
    Then customer Selects either new or existing customer
    Then customer Enter all the Details
    Then customer clicks on Order Button and get the order number for sim

    Examples:
      |Scenario_Id         |Serialno      |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|
      |TC_322 TC_346       |7             |24              |10GB      |5G             |NO                |75               |