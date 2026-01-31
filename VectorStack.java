import java.util.Vector;

public class VectorStack<T> implements Stack<T> {
    Vector<T> list = new Vector<>();

    public boolean isEmpety() {
        return list.isEmpty();
    }

    @Override
    public void push(T item){
        list.add(item);
    }

    @Override
    public T pop() {
        if (isEmpety()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        T top = list.get(list.size()-1);
        list.remove(top);
        return top;

    }

    @Override 
    public T peek() {
        if (isEmpety()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        return list.get(list.size()-1);
    }
}
