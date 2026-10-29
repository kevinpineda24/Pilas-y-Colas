
/**
    Clase que representa una pila usando nodos.
    Los elementos se agregan y se sacan desde el tope.
*/

public class pila {

    /**
        Nodo que guarda un dato y apunta al siguiente nodo.
    */
    private static class Nodo {
        int dato;
        Nodo siguiente;

        /** Crea un nodo con el dato recibido. */
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo tope;   // Apunta al nodo de arriba

    /** Crea una pila vacía. */
    public pila() {
        this.tope = null;
    }

    /** Comprueba si la pila está vacía. */
    public boolean estaVacia() {
        return tope == null;
    }

    /** Agrega un elemento en el tope de la pila. */
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    /**
        Elimina y devuelve el elemento que está en el tope.
        Si la pila está vacía, muestra un error.
    */
    public int pop() {
        if (estaVacia())
            throw new IllegalStateException("La pila está vacía");

        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    /** Devuelve el elemento del tope sin eliminarlo. */
    public int peek() {
        if (estaVacia())
            throw new IllegalStateException("La pila está vacía");

        return tope.dato;
    }

    /** Cuenta y devuelve los elementos de la pila. */
    public int tamaño() {
        int contador = 0;
        Nodo actual = tope;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    /** Muestra los elementos de la pila desde el tope. */
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }

        Nodo actual = tope;

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.siguiente != null)
                System.out.print(" ↓ ");

            actual = actual.siguiente;
        }

        System.out.println();
    }
}
