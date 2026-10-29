/**
    Clase que representa una cola usando nodos.
    Los elementos se agregan al final y se sacan del frente.
*/
public class Cola {

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

    private Nodo frente;   /** Primer nodo de la cola */ 
    private Nodo fin;      /** Último nodo de la cola */ 

    /** Crea una cola vacía. */
    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    /** Comprueba si la cola está vacía. */
    public boolean estaVacia() {
        return frente == null;
    }

    /**
        Agrega un dato al final de la cola.
    */
    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
            return;
        }

        fin.siguiente = nuevo;
        fin = nuevo;
    }

    /**
        Saca y devuelve el primer dato de la cola.
        Si está vacía, muestra un error.
    */
    public int desencolar() {
        if (estaVacia())
            throw new IllegalStateException("La cola está vacía");

        int valor = frente.dato;
        frente = frente.siguiente;

        if (frente == null)
            fin = null;

        return valor;
    }

    /** Devuelve el primer dato sin eliminarlo. */
    public int verFrente() {
        if (estaVacia())
            throw new IllegalStateException("La cola está vacía");

        return frente.dato;
    }

    /** Cuenta y devuelve los elementos de la cola. */
    public int tamaño() {
        int contador = 0;
        Nodo actual = frente;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    /** Muestra los elementos de la cola en pantalla. */
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo actual = frente;

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.siguiente != null)
                System.out.print(" → ");

            actual = actual.siguiente;
        }

        System.out.println();
    }
}
