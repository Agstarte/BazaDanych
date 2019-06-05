import org.junit.Test;

import static org.junit.Assert.*;

public class AdresTest {
    Adres adres = new Adres("Obornicka", "11-123", "5", "10");
    @Test
    public void getUlica() {
        assertEquals("Obornicka", adres.getUlica());
    }

    @Test
    public void getKodPocztowy() {
        assertEquals("11-123", adres.getKodPocztowy());
    }

    @Test
    public void getNrDomu() {
        assertEquals("5", adres.getNrDomu());
    }

    @Test
    public void getNrMieszkania() {
        assertEquals("10", adres.getNrMieszkania());
    }
}