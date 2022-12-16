
Feature: Login
  @test
  Scenario: Iniciar sesion
    Given me encuentro en la pagina login de saucedemo
    When se inicia sesion con usuario: standard_user y password: secret_sauce
    Then debe aparecer el titulo: PRODUCTS
    And existe el item: Sauce Labs Backpack

