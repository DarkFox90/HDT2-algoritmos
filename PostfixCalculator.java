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
    public double operate(String input) {
        for (String x : input.split(" ")) {
            if (x.isEmpty()) continue;
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
                    case "/":
                        if (b == 0) {
                            throw new ArithmeticException("no se puede dividir por 0");
                        } else {
                            stack.push(a / b);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("caracter no valido para operarse");
                }
            }
        }

        return stack.pop();

    }
    
    public boolean isNumeric(String Num) {
        try {
            Integer.parseInt(Num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}