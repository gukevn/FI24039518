/**
 * SC-304 - Caso Práctico 1 - Recursividad
 * Numbers.java — versión corregida
 *
 * Reglas respetadas:
 * - No se modifica el comportamiento de impresión ni el redondeo (10 decimales con printf).
 * - Se usan tipos double para evitar overflow en f(z,n).
 * - Se calcula la razón f(z,25) / f(z,24) en recursive e iterative.
 *
 * Referencias:
 * - https://en.wikipedia.org/wiki/Metallic_mean
 * - ChatGPT
 */

public class Numbers {

    // ==========================
    // main (NO MODIFICAR)
    // ==========================
    public static void main(String[] args) {
        String[] metals = {
            "Platinum", "Golden", "Silver", "Bronze", "Copper",
            "Nickel", "Aluminum", "Iron", "Tin", "Lead"
        };

        for (int z = 0; z < metals.length; z++) {
            double f = formula(z);
            double r = recursive(z);
            double i = iterative(z);

            System.out.printf("[%d] %s%n", z, metals[z]);
            System.out.printf(" ↳ formula(%d)   ≈ %.10f%n", z, f);
            System.out.printf(" ↳ recursive(%d) ≈ %.10f%n", z, r);
            System.out.printf(" ↳ iterative(%d) ≈ %.10f%n%n", z, i);
        }
    }

    // ==========================
    // públicos (NO MODIFICAR)
    // ==========================
    public static double formula(int z) {
        return (z + Math.sqrt(4 + z * z)) / 2.0;
    }

    // Cambio: recursive ahora usa double y devuelve la RAZÓN f(z,25)/f(z,24)
    public static double recursive(int z) {
        double f24 = seq(z, 24);
        double f25 = seq(z, 25);
        return f25 / f24;
    }

    // Cambio: iterative implementado con double para evitar overflow
    public static double iterative(int z) {
        double prev2 = 1.0; // f(.,0)
        double prev1 = 1.0; // f(.,1)
        double current = 0.0;

        for (int i = 2; i <= 25; i++) {
            current = z * prev1 + prev2; // f(i) = z*f(i-1) + f(i-2)
            prev2 = prev1;
            prev1 = current;
        }

        double f25 = prev1; // último calculado
        double f24 = prev2; // anterior
        return f25 / f24;
    }

    // ==========================
    // privados (se pueden tocar)
    // ==========================

    // Cambio: helper recursivo correcto en double (evita overflow de long)
    private static double seq(int z, int n) {
        if (n <= 1) return 1.0;                  // f(z,0)=1 y f(z,1)=1
        return z * seq(z, n - 1) + seq(z, n - 2);
    }
}
