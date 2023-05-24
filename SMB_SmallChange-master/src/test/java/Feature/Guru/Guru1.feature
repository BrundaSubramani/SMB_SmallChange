Feature: Book a call with an O2 Business Guru
  Scenario Outline: To check whether the Customer book a call with an O2 Business
    Given Customer is able to launch the business shop for book a call
    Then Customer can view the form and enters <Scenario_ID> "<app>" "<firstname>" "<lastname>" "<phonenumber>" "<email>" and other details
    Then click on submit button
    Then Customer get the appointment number

    Examples:
      |Scenario_ID   |app                |firstname|lastname|phonenumber|email           |
      |1             |McAfee             |Test     |Test    |07710163471|Test@yopmail.com|