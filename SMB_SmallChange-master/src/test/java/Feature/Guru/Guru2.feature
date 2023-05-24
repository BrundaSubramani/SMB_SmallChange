Feature: Book a call with an O2 Business Guru
  Scenario Outline: To check whether the Customer book a call with an O2 Business
    Given User is able to launch the business shop for book a call
    Then User can view the form and enters <Scenario_ID> "<app>" "<firstname>" "<lastname>" "<phonenumber>" "<email>" and other details
    Then User click on submit button
    Then User get the appointment number

    Examples:
      |Scenario_ID   |app                 |firstname|lastname|phonenumber|email           |
      |1             |Microsoft Office 365|Test     |Test    |07710163471|Test@yopmail.com|