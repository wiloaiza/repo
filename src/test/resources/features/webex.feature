#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Ingresar a WebEx
				Como usuario
				Requiero ingresar a webEx
				Mediante su sitio web

  @AccesoWebEx
  Scenario: Autenticar en WebEx
    Given Se requiere acceder a WebEx
    #And some other precondition
    When Se digita usuario y clave
    #And some other action
    #And yet another action
    Then Valida acceso exitoso
    #And check more outcomes
