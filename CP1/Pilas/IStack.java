package CP1.Pilas;

public interface IStack {
    boolean push(Double x);  // inserta; true=ok, false=overflow
    Double pop();            // saca; null si vacío
    Double peek();           // mira tope; null si vacío
    int size();              // cantidad de elementos
    boolean empty();         // true si vacío
    void print();            // imprime [a, b, c]
}
