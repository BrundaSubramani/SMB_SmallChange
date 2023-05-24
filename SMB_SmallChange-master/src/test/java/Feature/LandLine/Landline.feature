Feature: Order a device through business shop
  Scenario Outline: Customer orders a device through businessshop
    Given Customer is able to launch the businessshop and select the Landline
    Then customer check the Availability and then click check now button
    Then customer enter  "<Landline phone number>" and "<postcode>"
    Then Customer clicks the  continue button
    Then Customer enters the "<firstname>" "<lastname>" "<O2ContactNumber>" and "<postcode>"
    Then Customer see the basket page and click on proceed button.
    Then customer click on New customer button
    Then Customer fill  the details "<firstname>" "<lastname>"  "<O2ContactNumber>"  and click on order button
    Then customer is able to see the Order No.
    Examples:
      |Scenario_ID         | postcode | Landline phone number | firstname       | lastname             | O2ContactNumber |
      |TC_209,TC_210,TC_214| SL12AA   |     01132642584       | TTABAAAAAAAAAAA | TTAAAAAAAAAAAAAAAAAA |     07805100100 |