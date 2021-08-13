#Autor: Maloney David
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy whith the automation course
  @scenario1
  Scenario: Search for a automation course
    Given that brandon wants to learn automation at the academy Choucair
      | strUser  | strPassword   |
      | 89352098 | Choucair2021* |
    When he search fot the course
      | strCourse          |
      | Foundation Express |
    Then he finds the course called recources
      | strCourse          |
      | Foundation Express |