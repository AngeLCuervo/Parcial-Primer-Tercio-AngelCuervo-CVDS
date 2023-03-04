package test.java.edu.eci.cvds.tdd.fizz;

import main.java.edu.eci.cvds.tdd.multiplo.fizz;
import org.junit.Test;
import static org.junit.Assert.*;


public class FizzTest {

    @Test

    public void testContieneDigitos() {
        fizz a = new fizz();
        assertTrue(a.contieneDigitos(35));
        assertTrue(a.contieneDigitos(305));
        assertTrue(Fizz.contieneDigitos(533));
        assertFalse(Fizz.contieneDigitos(4));
        assertFalse(Fizz.contieneDigitos(123));
        assertFalse(Fizz.contieneDigitos(678));
    }
}
