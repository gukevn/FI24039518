package CP1.Pilas;

import java.util.Random;

public class TheStack implements IStack {

    // ===============================
    // Atributos privados (NO tocar)
    // ===============================
    private final Double[] data;
    private int top;              // apunta al próximo índice libre
    private final int capacity;

    // ===============================
    // Constructor (NO tocar)
    // ===============================
    public TheStack(int capacity) {
        this.capacity = capacity;
        this.data = new Double[capacity];
        this.top = 0;
    }

    // ===============================
    // Métodos a corregir (ya corregidos)
    // ===============================
    @Override
    public boolean push(Double x) {
        if (top == capacity) return false;  // overflow
        data[top++] = x;                    // inserta y avanza
        return true;
    }

    @Override
    public Double pop() {
        if (top == 0) return null;         // underflow
        Double val = data[--top];          // retrocede y toma
        data[top] = null;                  // limpieza
        return val;
    }

    @Override
    public Double peek() {
        if (top == 0) return null;
        return data[top - 1];
    }

    // ===============================
    // Métodos que no se tocan
    // ===============================
    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean empty() {
        return top == 0;
    }

    @Override
    public void print() {
        System.out.print("[");
        for (int i = 0; i < top; i++) {
            System.out.print(data[i]);
            if (i < top - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // ===============================
    // main DEL PROFESOR (usa n por args)
    // ===============================
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);   // capacidad de la pila (siempre válido)
        TheStack stack = new TheStack(n);
        Random rand = new Random();

        System.out.println("\nPushing {capacity + 1}");
        for (int i = 0; i < n + 1; i++) {
            Double x = rand.nextDouble();
            System.out.printf(" ↳ push(%s) → %s%n", x, stack.push(x));
        }

        System.out.println("\nPushed {full}");
        System.out.print(" ↳ print() → ");
        stack.print();
        System.out.printf("   ↳ peek() → %s%n", stack.peek());
        System.out.printf("   ↳ size() → %d%n", stack.size());
        System.out.printf("   ↳ empty() → %s%n", stack.empty());

        System.out.println("\nPopping {capacity + 1}");
        for (int i = 0; i < n + 1; i++) {
            System.out.printf(" ↳ pop() → %s%n", stack.pop());
        }

        System.out.println("\nPopped {empty}");
        System.out.print(" ↳ print() → ");
        stack.print();
        System.out.printf("   ↳ peek() → %s%n", stack.peek());
        System.out.printf("   ↳ size() → %d%n", stack.size());
        System.out.printf("   ↳ empty() → %s%n", stack.empty());
    }
}
