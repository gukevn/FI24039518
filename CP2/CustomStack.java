public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        StackNode node = new StackNode(word);

        // nuevo nodo apunta al actual tope
        node.setNext(_head);

        // y ahora la cabeza de la pila es este nodo
        _head = node;
    }

    public String pop() {
        // pila vacía
        if (_head == null) {
            return null;
        }

        // tomamos la palabra del tope
        String word = _head.getWord();

        // movemos la cabeza al siguiente nodo
        _head = _head.getNext();

        return word;
    }

    public int size() {
        int length = 0;
        StackNode current = _head;

        // contamos todos los nodos
        while (current != null) {
            length++;
            current = current.getNext();
        }

        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}
