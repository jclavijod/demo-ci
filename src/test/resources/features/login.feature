Feature: Login de Usuario
  Como usuario del sistema
  Quiero poder iniciar sesión con mis credenciales
  Para acceder a las funcionalidades de la aplicación

  Scenario: Login exitoso con credenciales válidas
    Given un usuario con usuario "juan" y clave "1234"
    When intenta iniciar sesión
    Then el sistema muestra "Bienvenido juan"

  Scenario Outline: Login fallido con credenciales inválidas
    Given un usuario con usuario "<usuario>" y clave "<clave>"
    When intenta iniciar sesión
    Then el sistema muestra "<mensaje>"

    Examples:
      | usuario | clave | mensaje                |
      | juan    | 0000  | Credenciales inválidas |
      | ana     | 9999  | Credenciales inválidas |