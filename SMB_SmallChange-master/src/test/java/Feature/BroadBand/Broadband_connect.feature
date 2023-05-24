Feature: Order a broadband through business shop
  Scenario Outline: Customer orders a broadband through businessshop
    Given Customer is able to launch the business shop
    When Customer hover on shop and click on Broadband
    Then customer enters the "<postcode>" "<fixedlinenumber>" "<o2mobilenumber>"
    Then Customer clicks the  check button
    Then Customer chooses the <Scenario_ID> "<plan>" for broadband and clicks on buynow button
    Then Customer clicks on continue button
    Then Customer enters the "<firstname>" "<lastname>" "<O2ContactNumber>" and installation address
    Then Customer can see the basket page and click on proceed button.
    Then customer click on Existing customer button
    Then Customer fill the details like "<firstname>" "<lastname>" "<BusinessName>" "<O2ContactNumber>" "<NoOfEmployees>" "<Email>" and click on order button
    Then customer is able to see the Order number

    Examples:
      |Scenario_ID  | postcode | fixedlinenumber | o2mobilenumber |plan                              | firstname           | lastname              | BusinessName         |O2ContactNumber  | NoOfEmployees   | Email              |
      |1            | LS146HP  | 01132642584     | 07710163471    |Business Broadband Connect        |  TTABAAAAAAAAAAA    |TTAAAAAAAAAAAAAAAAAA   |Business Professional | 07710163471     | 10              |testabc1@yopmail.com|