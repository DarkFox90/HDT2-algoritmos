/**
* Interfaz que define las operaciones básicas de una estructura de datos Pila (Stack).
* @author Mauricio Corado 25218 Carlos Pozuelos 25104
* @param <T> El tipo de elementos que almacenará la pila.
*/

public interface Stack<T> {
   /**
   * Inserta un elemento en el tope de la pila.
   * @param item El elemento a insertar.
   */
   public void push(T item);
   /**
   * Elimina y devuelve el elemento en el tope de la pila.
   * @return El elemento eliminado del tope.
   * @throws RuntimeException si la pila está vacía.
   */
   public T pop();
   /**
   * Devuelve el elemento en el tope de la pila sin eliminarlo.
   * @return El elemento en el tope.
   * @throws RuntimeException si la pila está vacía.
   */
   public T peek();
}
