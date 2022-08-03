@Sanity
Feature: Verificar el registro de cliente en plataforma

  Background:
    Given Usuario inicia aplicacion

  Scenario: Registrar usuario en plataforma
    When usuario presiona el boton signup
    And usuario ingresa el user "usuariozxzrueba104" y contraseña "Prueba123" y presiona el boton registrar
    Then Usuario verifica mensaje de confirmacion de registro "Sign up successful."


  Scenario: Intentar registrar mismo usuario
    When usuario presiona el boton signup
    And usuario ingresa el user "usuariozxzrueba104" y contraseña "Prueba123" y presiona el boton registrar
    Then Usuario verifica mensaje de alerta de usuario existente "This user already exist."