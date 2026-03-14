import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClasificadorTrianguloTest {

    @Test
    void noEsTriangulo() {
        Triangulo triangulo = new Triangulo();
        assertEquals("NoTriangulo", triangulo.clasificarTriangulo(0, 4, 5));
        assertEquals("NoTriangulo", triangulo.clasificarTriangulo(-1, 4, 5));
        assertEquals("NoTriangulo", triangulo.clasificarTriangulo(1, 2, 3));
        assertEquals("NoTriangulo", triangulo.clasificarTriangulo(5, 1, 1));
    }

    @Test
    void esEquilatero() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Equilatero", triangulo.clasificarTriangulo(3, 3, 3));
    }

    @Test
    void esIsosceles() {
        Triangulo triangulo = new Triangulo();

        assertEquals("Isosceles", triangulo.clasificarTriangulo(4, 4, 3));
        assertEquals("Isosceles", triangulo.clasificarTriangulo(3, 4, 4));
        assertEquals("Isosceles", triangulo.clasificarTriangulo(4, 3, 4));
    }

    @Test
    void esEscaleno() {
        Triangulo triangulo = new Triangulo();

        assertEquals("Escaleno", triangulo.clasificarTriangulo(4, 5, 6));
    }
}
