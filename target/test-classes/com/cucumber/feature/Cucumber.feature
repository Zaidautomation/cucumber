@sprint1
Feature: Login functionality for adactin application
@123
Scenario: User enter username and password
    Given User Launch the Application
    When User enter "mohamedzaid" as username 
    And User enter "222222" as password
    Then user verify valid username and password
    

Scenario: User find adactin project
    And Select hotel location
    And User choose the hotel
    And User choose room type
    And User choose number of rooms
    And User choose booking date
    And User choose end date
    And User choose adult per rooms
    And User choose child per rooms
    Then user verify the search results
    
 Scenario: User Select the hotel
    And user select hotel
    Then user verify the selected the hotel
    
 Scenario: User Conform Hotel
    And User Enter First Name as "Mohamed"
    And User Enter Last Name as "Zaid"
    And User Enter address as "93 Aliyar Street,Kayalpatnam"
    And User enter credit card number "928377483848283"
    And User select credit card type
    And User select credit card expiry date and year
    And User enter credit card ccv "132"
    Then user verify the Book Hotel
    
    
 