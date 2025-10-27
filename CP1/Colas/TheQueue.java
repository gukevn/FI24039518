package CP1.Colas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class TheQueue implements IQueue {

    // ===============================
    // Atributos privados (NO tocar)
    // ===============================
    private final Deque<Character> deque;

    // ===============================
    // Constructor (NO tocar)
    // ===============================
    public TheQueue() {
        this.deque = new ArrayDeque<>();
    }

    // ===============================
    // Cambios requeridos
    // ===============================

    // Cambio: usar API que ya retorna null si vacío (sin if)
    @Override
    public Character dequeue() {
        return deque.pollFirst(); // quita y retorna; null si vacío
    }

    // Cambio: usar API que ya retorna null si vacío (sin if)
    @Override
    public Character getFront() {
        return deque.peekFirst(); // solo consulta; null si vacío
    }

    // Cambio: formar codones consumiendo la cola; arreglo fijo de n/3
    @Override
    public String[] getCodons(int n) {
        String[] out = new String[n / 3];
        for (int i = 0; i < out.length; i++) {
            Character a = deque.pollFirst();
            Character b = deque.pollFirst();
            Character c = deque.pollFirst();
            out[i] = "" + a + b + c; // se permite que sean letras aleatorias
        }
        return out; // la cola queda vacía
    }

    // ===============================
    // Métodos que NO se modifican
    // ===============================
    @Override
    public int getSize() { return deque.size(); }

    @Override
    public boolean isEmpty() { return deque.isEmpty(); }

    @Override
    public void print() { System.out.println(deque); }

    // ===============================
    // Utilidad para pruebas del main
    // ===============================
    private static char rndNucleotide(Random r) {
        // ADN: A, C, G, T
        char[] nts = {'A', 'C', 'G', 'T'};
        return nts[r.nextInt(4)];
    }

    // ===============================
    // main del profesor (NO modificar)
    // ===============================
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // múltiplo de 3, siempre válido
        TheQueue q = new TheQueue();
        Random r = new Random();

        // llenar la cola con n nucleótidos
        for (int i = 0; i < n; i++) q.deque.addLast(rndNucleotide(r));

        System.out.println("\nFilled {full}");
        System.out.print(" ↳ print() → ");
        q.print();
        System.out.printf("   ↳ getFront() → %s%n", q.getFront());
        System.out.printf("   ↳ getSize() → %d%n", q.getSize());
        System.out.printf("   ↳ isEmpty() → %s%n", q.isEmpty());

        System.out.print("\ngetCodons() → ");
        String[] codons = q.getCodons(n);
        System.out.print("[");
        for (int i = 0; i < codons.length; i++) {
            System.out.print(codons[i]);
            if (i < codons.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("\nEnd {empty}");
        System.out.print(" ↳ print() → ");
        q.print();
        System.out.printf("   ↳ getFront() → %s%n", q.getFront());
        System.out.printf("   ↳ getSize() → %d%n", q.getSize());
        System.out.printf("   ↳ isEmpty() → %s%n", q.isEmpty());
    }
}
