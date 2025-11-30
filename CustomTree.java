import java.util.Stack;

public class CustomTree {

    private TreeNode _root;

    public CustomTree() {
        _root = null;
    }

    public void insert(double tf, String word) {
        _root = insert(_root, tf, word);
    }

    private TreeNode insert(TreeNode node, double tf, String word) {
        // caso base, árbol vacío o subárbol vacío
        if (node == null) {
            TreeNode newNode = new TreeNode(tf);
            newNode.addWord(word);
            return newNode;
        }

        double currentTf = node.getTf();

        if (tf < currentTf) {
            // vamos al subárbol izquierdo
            node.setLeft(insert(node.getLeft(), tf, word));
        } else if (tf > currentTf) {
            // vamos al subárbol derecho
            node.setRight(insert(node.getRight(), tf, word));
        } else {
            // mismo TF, se agrega la palabra a la pila del nodo
            node.addWord(word);
        }

        // siempre se retorna la raíz del subárbol actual
        return node;
    }

    public String getInOrderTraversal() {
        return getInOrderTraversal(_root);
    }

    private String getInOrderTraversal(TreeNode root) {
        var builder = new StringBuilder();
        var stack = new Stack<TreeNode>();
        var node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            node = stack.pop();
            builder.append(node.getTf() + "\n" + node.getWords() + "\n\n");
            node = node.getRight();
        }
        return builder.toString();
    }
}
