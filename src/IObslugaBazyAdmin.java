public interface IObslugaBazyAdmin extends IObslugaBazy{
    void dodajRekord();
    void usunRekord(Rekord wywal);
    void zapiszBaze();
    void edytujRekord(String ID);
}
