/// chat con chatgpt https://chatgpt.com/share/692de7b0-4f74-8010-a780-06c964d9d75b
public class CustomGraph {

    private char[] _chars;
    private int[][] _matrix;

    public CustomGraph(char[] chars) {
        _chars = chars;
        _matrix = new int[chars.length][chars.length];
    }

    public void addDirectedEdge(char source, char target) {
        addEdge(source, target);
    }

    private void addEdge(char source, char target) {
        int sourceIndex = -1;
        int targetIndex = -1;

        // buscamos las posiciones de los caracteres en el arreglo _chars
        for (int i = 0; i < _chars.length; i++) {
            if (_chars[i] == source) {
                sourceIndex = i;
            }
            if (_chars[i] == target) {
                targetIndex = i;
            }
        }

        // si ambos existen en el arreglo, incrementamos la adyacencia
        if (sourceIndex != -1 && targetIndex != -1) {
            _matrix[sourceIndex][targetIndex] = _matrix[sourceIndex][targetIndex] + 1;
        }
    }

    public String getMatrix() {
        var builder = new StringBuilder(" ");
        for (int index = 0; index < _chars.length; index++) {
            builder.append(" , " + _chars[index]);
        }
        for (int row = 0; row < _chars.length; row++) {
            builder.append("\n");
            builder.append(_chars[row]);
            for (int col = 0; col < _chars.length; col++) {
                builder.append(" , " + _matrix[row][col]);
            }
        }
        builder.append("\n");
        return builder.toString();
    }
}
