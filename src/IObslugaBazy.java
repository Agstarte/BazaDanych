import java.util.ArrayList;

public interface IObslugaBazy {
    void pokazRekord(String ID);
    void przegladajKlientow ();
    void przegladajNieruchomosci ();
    void wyczyscRekord (Rekord rekord);
    ArrayList<Rekord> getBaza();  // ZMIENIONE
    int wyszukajRekord(String ID);
}