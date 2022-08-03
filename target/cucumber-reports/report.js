$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("001_Signup.feature");
formatter.feature({
  "line": 2,
  "name": "Verificar el registro de cliente en plataforma",
  "description": "",
  "id": "verificar-el-registro-de-cliente-en-plataforma",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "duration": 2352987600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Usuario inicia aplicacion",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionCommon.usuario_inicia_aplicacion()"
});
formatter.result({
  "duration": 1384017000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Registrar usuario en plataforma",
  "description": "",
  "id": "verificar-el-registro-de-cliente-en-plataforma;registrar-usuario-en-plataforma",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "usuario presiona el boton signup",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "usuario ingresa el user \"usuariozxzrueba104\" y contraseña \"Prueba123\" y presiona el boton registrar",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Usuario verifica mensaje de confirmacion de registro \"Sign up successful.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IndexPageStepDefinition.usuarioPresionaElBotonSignup()"
});
formatter.result({
  "duration": 703476600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuariozxzrueba104",
      "offset": 25
    },
    {
      "val": "Prueba123",
      "offset": 59
    }
  ],
  "location": "IndexPageStepDefinition.usuarioIngresaElUserYContraseñaYPresionaElBotonRegistrar(String,String)"
});
formatter.result({
  "duration": 2323229500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign up successful.",
      "offset": 54
    }
  ],
  "location": "IndexPageStepDefinition.usuarioVerificaMensajeDeConfirmacionDeRegistro(String)"
});
formatter.result({
  "duration": 560330900,
  "status": "passed"
});
formatter.after({
  "duration": 283800,
  "status": "passed"
});
formatter.before({
  "duration": 173200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Usuario inicia aplicacion",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionCommon.usuario_inicia_aplicacion()"
});
formatter.result({
  "duration": 269562900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Intentar registrar mismo usuario",
  "description": "",
  "id": "verificar-el-registro-de-cliente-en-plataforma;intentar-registrar-mismo-usuario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "usuario presiona el boton signup",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "usuario ingresa el user \"usuariozxzrueba104\" y contraseña \"Prueba123\" y presiona el boton registrar",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Usuario verifica mensaje de alerta de usuario existente \"This user already exist.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IndexPageStepDefinition.usuarioPresionaElBotonSignup()"
});
formatter.result({
  "duration": 648435900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuariozxzrueba104",
      "offset": 25
    },
    {
      "val": "Prueba123",
      "offset": 59
    }
  ],
  "location": "IndexPageStepDefinition.usuarioIngresaElUserYContraseñaYPresionaElBotonRegistrar(String,String)"
});
formatter.result({
  "duration": 2299843900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This user already exist.",
      "offset": 57
    }
  ],
  "location": "IndexPageStepDefinition.usuarioVerificaMensajeDeAlertaDeUsuarioExistente(String)"
});
formatter.result({
  "duration": 528750600,
  "status": "passed"
});
formatter.after({
  "duration": 127400,
  "status": "passed"
});
});