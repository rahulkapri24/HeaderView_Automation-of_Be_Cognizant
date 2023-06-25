Feature: HeaderView

  Scenario: Login using correct Email ID and Password
    Given User is on the Login page
    And User selects the required login options
    Then User is redirected to Home page

  Scenario: Verifcation  of Account Profile Information
    Given User is on Home Page
    When User clicks on  Logo Profile
    Then User information is fetched

  Scenario: Opening Be Cognizant Header Section
    Given User Clicks on Company Header
    When User Clicks on Service Header
    And User Clicks on Sales Resource Header
    And User Clciks on Market and Countries Header
    And User Clicks on Corporate Functions Header
    Then User Clicks on People Element Header

  Scenario: Searching and Opening Ethics and Compliance  Page
    Given User Clicks to Corporate Functions Header
    Then User hover on legal & Corporate Affairs
    And User Clicks on Ethics and Compliance
    Then User is redirected to Ethics and Comliance
    And User scrolls down the Ethic Page
    And User print the Ethic Officer Name and Designation
    And User print ethics details
    Then User print resource links
