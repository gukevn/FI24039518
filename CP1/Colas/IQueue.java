package CP1.Colas;

public interface IQueue {
    Character dequeue();     // quita y retorna el primero; null si vacío
    Character getFront();    // retorna el primero sin quitar; null si vacío
    int getSize();           // tamaño actual
    boolean isEmpty();       // true si vacío
    void print();            // imprime la cola [A, C, G, T]
    String[] getCodons(int n); // retorna n/3 codones y deja la cola vacía
}
