#language:en
@stories
Feature: Sign up in the website UTest
  As a Tester, I want to sign up in the website UTest
  @scenario1
  Scenario: Sign up in the website UTest
    Given than Andres wants to sign up in the website UTest
    When he complete the form in the website UTest
    |firstname|lastname|email                |month |day |year  | city     | zip    | country  | password     |
    |Andres   | Yanquen|andresayf12@hotmail.com|June  |23  |1996  | Medellin | 050023 | Colombia | Choucair2021 |
    Then he finds the text
    |message|
    |The last step|