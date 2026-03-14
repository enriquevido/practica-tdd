public class Triangulo {
    private static final String NO_TRIANGULO = "NoTriangulo";
    private static final String EQUILATERO = "Equilatero";
    private static final String ISOSCELES = "Isosceles";
    private static final String ESCALENO = "Escaleno";

    public String clasificarTriangulo(int a, int b, int c) {
        if (!esTrianguloValido(a, b, c)) {
            return NO_TRIANGULO;
        }

        if (a == b && b == c) {
            return EQUILATERO;
        }

        if (a == b || a == c || b == c) {
            return ISOSCELES;
        }

        return ESCALENO;
    }

    private boolean esTrianguloValido(int a, int b, int c) {
        return ladosSonPositivos(a, b, c) && cumpleDesigualdadTriangular(a, b, c);
    }

    private boolean ladosSonPositivos(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    private boolean cumpleDesigualdadTriangular(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
