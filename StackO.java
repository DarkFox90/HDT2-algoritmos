/**
* Implementación de una Pila utilizando la clase Vector de Java.
* Esta clase es de tamaño variable y soporta genéricos.
* @author Mauricio Corado 25218 Carlos Pozuelos 25104
* @param <T> El tipo de datos almacenados en la pila.
*/

import java.util.Vector;
public class StackO<T> implements Stack<T> {
    Vector<T> list = new Vector<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T item){
        list.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        T top = list.get(list.size()-1);
        list.remove(top);
        return top;

    }

    @Override 
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        return list.get(list.size()-1);
    }
}
