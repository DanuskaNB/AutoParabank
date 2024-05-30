@Parabank
Feature: Ingreso a la pagina Parabank

  Como usuario quiero realizar un registro y logueo
  para poder ingresar a la pagina Parabank

  @HAPPY_PATH @CP-001
  Scenario Outline: Registro exitoso
    Given De que ingreso a la pagina "<IDTest>"
    And   No tengo una cuenta registrada
    When  Selecciono el boton register
    And   Ingreso los datos en el formulario "<IDTest>"
    And   Selecciono el boton Register
    Then  Validamos la pantalla de inicio

    Examples:
      | IDTest |
      | 1      |

  @HAPPY_PATH @CP-002
  Scenario Outline: Login exitoso
    Given De que ingreso a la pagina "<IDTest>"
    And   Tengo una cuenta registrada
    When  Ingreso mi usuario y contranseña "<IDTest>"
    And   Selecciono el boton ingresar
    Then  Validamos el mensaje

    Examples:
      | IDTest |
      | 1      |