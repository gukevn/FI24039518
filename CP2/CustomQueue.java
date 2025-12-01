public class CustomQueue {

    private QueueNode _head;

    public CustomQueue() {
        _head = null;
    }

    public void enqueue(int index) {
        QueueNode node = new QueueNode(index);

        // si la cola está vacía, el nuevo nodo es la cabeza
        if (_head == null) {
            _head = node;
            return;
        }

        // si no, recorremos hasta el último y lo enlazamos al final
        QueueNode current = _head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    public int dequeue() {
        // cola vacía, valor negativo como indica el enunciado
        if (_head == null) {
            return -1;
        }

        // tomamos el índice del primer nodo y avanzamos la cabeza
        int index = _head.getIndex();
        _head = _head.getNext();
        return index;
    }

    public int getSize() {
        int size = 0;
        QueueNode current = _head;

        // contamos todos los nodos desde la cabeza hasta el final
        while (current != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }

    public String getIndexes() {
        var builder = new StringBuilder();
        for (var index = dequeue(); index > -1; index = dequeue()) {
            builder.append(" " + index);
        }
        return builder.toString();
    }
}
