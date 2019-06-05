public class Kontakt {
    private String imie;
    private String nazwisko;
    private String mail;
    private String nrKontaktowy;


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

    public void setKontakt(String imie, String nazwisko, String mail, String nrKontaktowy)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.mail=mail;
        this.nrKontaktowy=nrKontaktowy;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNrKontaktowy(String nrKontaktowy) {
        this.nrKontaktowy = nrKontaktowy;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getMail() {
        return mail;
    }

    public String getNrKontaktowy() {
        return nrKontaktowy;
    }




}
