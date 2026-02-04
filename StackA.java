/**
* Implementación de una Pila utilizando la clase Arrays de Java.
* Esta clase es de tamaño variable y soporta genéricos.
* @author Mauricio Corado 25218 Carlos Pozuelos 25104
* @param <T> El tipo de datos almacenados en la pila.
*/

import java.util.ArrayList;
public class StackA<T> implements Stack<T> {
    ArrayList<T> list = new ArrayList<>();

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
