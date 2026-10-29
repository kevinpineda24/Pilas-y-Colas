/**
    Clase principal que prueba el funcionamiento de la pila.
    Permite agregar, eliminar y consultar elementos.
*/

public class main {
    public static void main(String[] args) {
        pila pila = new pila();

        // Comprueba si la pila está vacía
        System.out.println("¿Está vacía? " + pila.estaVacia()); // true

        // Agrega tres elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.print("pila tras push 10, 20, 30: ");
        pila.imprimir(); // 30 ↓ 20 ↓ 10

        // Consulta el elemento del tope sin eliminarlo
        System.out.println("peek():  " + pila.peek()); // 30

        // Elimina el elemento que está en el tope
        System.out.println("pop():   " + pila.pop()); // 30

        System.out.print("pila tras pop: ");
        pila.imprimir(); // 20 ↓ 10

        // Muestra la cantidad de elementos restantes
        System.out.println("Tamaño: " + pila.tamaño()); // 2

        // Elimina los elementos restantes
        System.out.println("pop():   " + pila.pop()); // 20
        System.out.println("pop():   " + pila.pop()); // 10

        // Comprueba que la pila vuelva a estar vacía
        System.out.println("¿Está vacía? " + pila.estaVacia()); // true
    }
}
