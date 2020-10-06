package FigurasAvanzadas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CirculoTest {
    private static Double errorAdmitido = 1e-6;
    Circulo c1;
    Circulo c2;
    Circulo c3;
    Circulo c4;

    @Before
    public void crearRectangulos () {
        c1 = new Circulo(170);
        c2 = new Circulo(90);
        c3 = new Circulo(150);
        c4 = new Circulo(210);
    }

    @Test
    public void testConstrutor1Argumento () {
        assertEquals(Integer.valueOf(170), c1.getDiametro());
        assertEquals(Integer.valueOf(170), c1.getRadio());
        assertEquals(Integer.valueOf(90), c2.getDiametro());
        assertEquals(Integer.valueOf(90), c2.getRadio());
    }

    @Test
    public void testConstrutoc2Argumentos () {
        assertEquals(Integer.valueOf(150), c3.getDiametro());
        assertEquals(Integer.valueOf(90), c3.getRadio());
        assertEquals(Integer.valueOf(210), c4.getDiametro());
        assertEquals(Integer.valueOf(190), c4.getRadio());
    }

    @Test
    public void testConstrutorID () {
        assertEquals("Circulo1", c1.getId());
        assertEquals("Circulo2", c2.getId());
        assertEquals("Circulo3", c3.getId());
        assertEquals("Circulo4", c4.getId());
    }

    // @DisplayName("Verifica valor de la base")
    @Test
    public void testSetRadio() {
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(-1);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(0);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(1);
        assertEquals(Integer.valueOf(1), c1.getRadio());
        c1.setRadio(100);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(600);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(501);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(500);
        assertEquals(Integer.valueOf(500), c1.getRadio());
        c1.setRadio(499);
        assertEquals(Integer.valueOf(499), c1.getRadio());
    }

    // @DisplayName("Verifica valor de la altura")
    @Test
    public void testSetAltura () {
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(-1);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(0);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(1);
        assertEquals(Integer.valueOf(1), c1.getRadio());
        c1.setRadio(100);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(600);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(501);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(500);
        assertEquals(Integer.valueOf(500), c1.getRadio());
        c1.setRadio(499);
        assertEquals(Integer.valueOf(499), c1.getRadio());
    }

    @Test
    public void testPerimetro () {
        assertEquals(Double.valueOf(680), c1.getDiametro(), errorAdmitido);
        assertEquals(Double.valueOf(360), c2.getDiametro(), errorAdmitido);
        assertEquals(Double.valueOf(480), c3.getDiametro(), errorAdmitido);
        assertEquals(Double.valueOf(800), c4.getDiametro(), errorAdmitido);
    }

    @Test
    public void testSuperficie () {
        assertEquals(Double.valueOf(28900), c1.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(8100),  c2.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(13500), c3.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(39900), c4.getSuperficie(), errorAdmitido);
    }

    @Test
    public void testToStringLocal () {
        assertEquals("Altura=170, Base=170", c1.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=90, Base=90", c2.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=90, Base=150", c3.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=190, Base=210", c4.toString().split(" \\+\\+ ")[1]);
    }

    @Test
    public void testToStringCompleto () {
        assertEquals("Figura Circulo1 (null,null) ++ Altura=170, Base=170", c1.toString());
        assertEquals("Figura Circulo2 (null,null) ++ Altura=90, Base=90", c2.toString());
        assertEquals("Figura Circulo3 (null,null) ++ Altura=90, Base=150", c3.toString());
        assertEquals("Figura Circulo4 (null,null) ++ Altura=190, Base=210", c4.toString());
    }

    @Test
    public void testCompareTo () {
        assertEquals( 0, c1.compareTo(c1));
        assertEquals( 1, c1.compareTo(c2));
        c2.setRadio(289);
        c2.setRadio(100);
        assertEquals(-1, c1.compareTo(c2));
        assertEquals(-1, c1.compareTo(c4));
        c1.setRadio(210);
        c1.setRadio(190);
        assertEquals(-1, c1.compareTo(c4));
        c1.setRadio(191);
        assertEquals( 1, c1.compareTo(c4));
    }

}
