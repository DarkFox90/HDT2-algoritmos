/** 
* PostfixCalculator.java
* Evalua una expresion en formato postfix y devuelve un reusltado entero
* Precondicion:
* La cadena input debe estar en formato postfix valido 
* los operando deben ser enteros de un solo digito 
* los elementos deben estar separdados por un espacio 
* Postcondicion: 
* Devuelve un entero con el reusltado final de la expresion 
* Lanza un ArithmeticException si se intenta dividir entre 0
* Lanza una RuntimeException si la expresion es invalida
* @param input LA expresion postfix leida del archivo datos.txt
* @return resultado entero de la expresion postfix    
* @author Mauricio Corado 25218 Carlos Pozuelos 25104
* @version 1.0
* @since 31-01-2026
*/ 
public class PostfixCalculator implements Calc{
    private Stack<Integer> stack;

    public PostfixCalculator(Stack<Integer> stack){
        this.stack = stack;
    }
    @Override
    public int operate(String input) {
        input.trim().split(" ");
        for (String x : input.split(" ")) {
            if (isNumeric(x)) {
                stack.push(Integer.parseInt(x));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (x) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    //falta case "/": debe validar que b no sea 0 
                    //Tambien falta manejar caracteres no validos
                }
            }
        }

        return stack.pop();

    }
    //Realizar el metodo isNumeric para validar si una cadena es un numero o no
    public boolean isNumeric(String Num) {
    }
}


