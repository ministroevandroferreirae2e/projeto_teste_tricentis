#Author: ministroevandroferreira@gmail.com

@preencherFormulario
Feature: Preencher Formulario
  Como usuario quero preencher formulario para validar mensagem

  @testePositivo
  Scenario: Preencher Formulario com dados validos
    Given que esteja no site sampleapp.tricentis
    And preencha todas as abas com dados validos
    When enviar o formulario
    Then valido a mensagem de dados enviados com sucesso