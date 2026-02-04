/**
* Interfaz que define el comportamiento de una calculadora de expresiones.
* @author Mauricio Corado 25218 Carlos Pozuelos 25104
*/

public interface Calc {
    /**
    * Procesa una cadena de texto y realiza los cálculos correspondientes.
    * @param input La expresión a evaluar.
    * @return El resultado entero de la operación.
    */
    double operate(String input);
}