Feature: Feature001
  Scenario Outline: To verify Sales Rep is able to perform an E2E
    Given useR is on sales force home page on web
    When useR enter User Name "<username>" and password "<Password>" and click enter button and home page is displayed
    Then User navigates to search box and search for ben myres SME and click on search button
    Then User logins to the Ben Myres SME profile
    Then User navigates to opportunity tab and creates the new opportunity with the following details "<Opportunity Name>" "<Account_Name>" "<Stage>" "<Type>" "<Close_Date>"
    Then user creates the product basket to add SMB Digital Products


    Examples:
    |Scenario_Id                    |Opportunity Name  |Account_Name| Stage            | Type       | Close_Date|Contract_Term|Product_PurchaseType|Service_Template|Digital_ProductName  |DISE_AccountNumber|CSP_Product|Microsoft_Admin_Domain   |
    |TC_1 TC_3 TC_138 TC_219 TC_375 |Test              |Test        |Awareness of Needs|New Business| DD/MM/YYY |1Month       |New                 |o365            |Enterprise Multi SKU |4667658           |YES        |Microsoft.onmicrosoft.com|