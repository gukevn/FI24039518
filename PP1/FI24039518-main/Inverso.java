public class Inverso {

    // Método recursivo: usa cociente y residuo para construir el inverso
    private static int invertirRec(int n, int acumulado) {
        // Caso base: cuando n es un solo dígito
        if (n < 10) {
            return acumulado * 10 + n;
        }
        // residuo = último dígito; cociente = "n" sin su último dígito
        int residuo = n % 10;
        int cociente = n / 10;
        // Construimos el número invertido acumulando el residuo al final y seguimos con el cociente
        return invertirRec(cociente, acumulado * 10 + residuo);
    }

    // API pedida: recibe un int y retorna su inverso como int
    public static int invertir(int n) {
        // Por definición del enunciado, n es natural (>= 0)
        // Caso especial: 0 -> 0
        if (n == 0) return 0;
        return invertirRec(n, 0);
    }

    public static void main(String[] args) {
        // Validaciones mínimas según especificación
        if (args.length != 1) {
            System.out.println("Uso: java Inverso <numero_natural>");
            System.exit(1);
        }

        int original;
        try {
            original = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: el argumento debe ser un numero entero (natural >= 0).");
            System.exit(1);
            return; // para el compilador
        }

        if (original < 0) {
            System.out.println("Error: el numero debe ser natural (>= 0).");
            System.exit(1);
        }

        int inverso = invertir(original);
        System.out.println(original + " \u2192 " + inverso); // \u2192 = flecha →
        // El programa termina aquí automáticamente
    }
}


