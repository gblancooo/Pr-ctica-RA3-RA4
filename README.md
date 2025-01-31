Práctica RA3-RA4: Pruebas Unitarias
Descripción
En esta práctica, se han desarrollado pruebas unitarias para los métodos depositAmount (depositar dinero) y withdrawAmount (retirar dinero) de la clase Account. El objetivo es garantizar que estos métodos funcionan correctamente y manejan adecuadamente situaciones excepcionales, como cantidades negativas o saldo insuficiente.

Pruebas Realizadas
Se han implementado y ejecutado las siguientes pruebas unitarias:

Depósito correcto (testDepositAmount):

Verifica que el saldo de la cuenta se incrementa correctamente al depositar una cantidad válida.

Depósito con cantidad negativa (testDepositAmountNegative):

Comprueba que el sistema lanza una excepción al intentar depositar una cantidad negativa.

Retirada correcta (testWithdrawAmount):

Verifica que el saldo de la cuenta se reduce correctamente al retirar una cantidad válida.

Retirada con cantidad negativa (testWithdrawAmountNegative):

Comprueba que el sistema lanza una excepción al intentar retirar una cantidad negativa.

Retirada con saldo insuficiente (testWithdrawAmountInsufficientBalance):

Verifica que el sistema lanza una excepción al intentar retirar más dinero del disponible en la cuenta.

Resultados
Todas las pruebas han sido ejecutadas con éxito, confirmando que los métodos depositAmount y withdrawAmount funcionan según lo esperado. Además, se ha validado que el sistema maneja correctamente los casos de error, como cantidades negativas o saldo insuficiente.
