public class Kontakt {
    protected String imie;
    protected String nazwisko;
    protected String mail;
    protected String nrKontaktowy;


    public Kontakt(String imie, String nazwisko, String mail, String nrKontaktowy)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.mail=mail;
        this.nrKontaktowy=nrKontaktowy;
    }
    public void wyswietlKontakt()
    {
        System.out.println(imie + " " + nazwisko + "\n" + mail + "\n" + nrKontaktowy);
    }






}
