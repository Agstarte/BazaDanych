import org.junit.Test;

import static org.junit.Assert.*;

public class AdresTest {
    Adres adres = new Adres("Obornicka", "11-123", "5", "10");

    @Test
    public void constructorTest() {
        assertEquals("Obornicka", adres.ulica);
        assertEquals("11-123", adres.kodPocztowy);
        assertEquals("5", adres.nrDomu);
        assertEquals("10", adres.nrMieszkania);
    }
}