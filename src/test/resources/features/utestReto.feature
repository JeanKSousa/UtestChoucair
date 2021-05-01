# Autor: Jean Sousa
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: register a new user to Utest
    Given Then the user wants to register a new user to Utest
    When He enters the data of the new user to the form
      |strFirstName|strLastName|strEmail            |strMonth   |strDay |strYear|strCity         |strPostal|strPassword|
      |Juan        |Solis      |maria.solis@test.com|December   |6      |1996   |Veracruz, Panama|507      |PasswordTest12|
    Then The user a welcome message to Utest
