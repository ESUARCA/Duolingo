#encoding: iso-8859-1
Feature: Registrarse en Duolingo
	Yo como usuario nuevo de Duolingo
	Quiero Registrarme en el aplicativo
	Para tener aprender un idioma

  @exitoso
  Scenario: Usuario inicia sesion con usuario y contrasena existentes
    When Registra en Duolingo seleccionando Español con intensidad Regular
    Then Para emprender un idioma