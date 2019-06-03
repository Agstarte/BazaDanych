import java.io.*;
import java.util.Scanner;

public class Klient extends Rekord {

    private Kontakt osoba;
   
    
    /*
                KOLEJNOsĆ PODAWANIA DANYCH DO KONSTRUKTORA!!! :
    1. ID  2. imie  3. nazwisko  4. email  5.  telefon 6. cena  7. czynsz  8. powierzchnia calkowita  9. dzielnica  10.  osiedle  11. typ
    12. pietro/na ile  13. ilosc pokoi 14. ilosc lazienek  15. wysokosc czynszu  16. balkon?  17. ogrod?  18. miejsca parkingowe naziemne
    19. miejsca parkingowe podziemne  20. piwnica 21. winda  22.  osiedle strzeżone  23. rynek wtorny  24. opis  25. komentarze
    
    */


    public Klient(String ID ,String imie, String nazwisko, String email, String tel, String cena, String czynsz, String powCalkowita, String dzielnica,
                  String osiedle, String typ, String pietroNaIle, String iloscPokoi, String iloscLazienek, String wysokoscCzynszu, String balkon, String ogrod,
                  String miejscaParkingoweNaziemne, String miejscaParkingowePodziemne, String piwnica, String winda, String osiedleStrzezone,
                  String rynekWtorny, String opis, String komentarz)
    {
        super(ID, cena, czynsz, powCalkowita, dzielnica, osiedle, typ, pietroNaIle, iloscPokoi, iloscLazienek, wysokoscCzynszu, balkon, ogrod, miejscaParkingoweNaziemne, miejscaParkingowePodziemne, piwnica, winda, osiedleStrzezone, rynekWtorny, opis, komentarz);
        this.osoba = new Kontakt(imie, nazwisko, email, tel);
    }




    @Override
    public void pokazSzczegoly ()
    {
        System.out.println("Klient: " + this.ID);
        osoba.getKontakt();
        System.out.println("Wymagana cena: " + getCena() + "\nWymagany czynsz: " + getCzynsz()+ "\nWymagana pow. calkowita: " + getPowCalkowita()
                + "\nDzielnica: " + getDzielnica() + "\nOsiedle: " + getOsiedle() + "\nTyp: " + getTyp() + "\nPietro/na ile pieter: " + getPietroNaIle()
                + "\nIlosc pokoi: " + getIloscPokoi()+ "\nIlosc lazienek: " + getIloscLazienek() + "\nWysokosc czynszu: " + getWysokoscCzynszu() +
                "\nCzy balkon?: " + getBalkon() + "\nCzy ogrod?: " + getOgrod() + "\nMiejsca parkingowe naziemne: " + getMiejscaParkingoweNaziemne() +
                "\nMiejsca parkingowe podziemne: " + getMiejscaParkingowePodziemne() + "Czy piwnica?: " + getPiwnica() + "\nCzy winda?: " + getWinda() +
                "\nCzy osiedle strzezone?: " + getOsiedleStrzezone() + "\nCzy rynek wtorny?: " + getRynekWtorny() + "\nOpis: " + getOpis() + "\nKomentarze: " + getKomentarz() + "\n");
    }
    @Override
    public void edytuj()  //ZMIENIONE
    {
        int number=1;

        System.out.println("Tak wygladaja dane wybranego klienta: ");//wyswietla wszystkie pola
        pokazSzczegoly();
        while (number != 0) {
        System.out.println("Wybierz pole do edycji: (wpisz cyfre od 1 do 30) \n");

        System.out.println("1. ID  2. imie  3. nazwisko  4. email  5.  telefon 6. cena  7. czynsz  8. powierzchnia calkowita  9. dzielnica  10.  osiedle  11. typ\n"
                + "12. pietro/na ile  13. ilosc pokoi 14. ilosc lazienek  15. wysokosc czynszu  16. balkon?  17. ogrod?  18. miejsca parkingowe naziemne\n"
                + "19. miejsca parkingowe podziemne  20. piwnica 21. winda  22.  osiedle strzeżone  23. rynek wtorny  24. opis  25. komentarze\n Wpisz \"0\" zeby wyjsc");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine(); // wczytujemy numerek z klawiatury
        number = Integer.parseInt(text);


            switch (number) {         //switch ktore chcesz zmienic
                case 1:
                    System.out.println("Podaj nowe ID: ");
                    String id = input.nextLine();
                    this.ID = id;
                    break;
                case 2:
                    System.out.println("Podaj nowe imie: ");
                    String imie = input.nextLine();
                    osoba.setImie(imie);
                    break;
                case 3:
                    System.out.println("Podaj nowe nazwisko: ");
                    String nazwisko = input.nextLine();
                    osoba.setNazwisko(nazwisko);
                    break;
                case 4:
                    System.out.println("Podaj nowy e-mail: ");
                    String mail = input.nextLine();
                    osoba.setMail(mail);
                    break;
                case 5:
                    System.out.println("Podaj nowy nr. telefonu: ");
                    String tel = input.nextLine();
                    osoba.setNrKontaktowy(tel);
                    break;
                case 6:
                    System.out.println("Podaj nowa cene: ");
                    String cen = input.nextLine();
                    setCena(cen);
                    break;
                case 7:
                    System.out.println("Podaj nowy czynsz: ");
                    String czyn = input.nextLine();
                    setCzynsz(czyn);
                    break;
                case 8:
                    System.out.println("Podaj nowa pow. calkowita: ");
                    String pow = input.nextLine();
                    setPowCalkowita(pow);
                    break;
                case 9:
                    System.out.println("Podaj nowa dzielnice: ");
                    String dzielnia = input.nextLine();
                    setDzielnica(dzielnia);
                    break;
                case 10:
                    System.out.println("Podaj nowe osiedle: ");
                    String osied = input.nextLine();
                    setOsiedle(osied);
                    break;
                case 11:
                    System.out.println("Podaj nowy typ nieruchomosci: ");
                    String typek = input.nextLine();
                    setTyp(typek);
                    break;
                case 12:
                    System.out.println("Podaj nowe pietro/na ile pieter: ");
                    String pietro = input.nextLine();
                    setPietroNaIle(pietro);
                    break;
                case 13:
                    System.out.println("Podaj nowa ilosc pokoi: ");
                    String iloscp = input.nextLine();
                    setIloscPokoi(iloscp);
                    break;
                case 14:
                    System.out.println("Podaj nowa ilosc lazienek:");
                    String iloscl = input.nextLine();
                    setIloscLazienek(iloscl);
                    break;
                case 15:
                    System.out.println("Podaj nowa wysokosc czynszu: ");
                    String wysczynsz = input.nextLine();
                    setWysokoscCzynszu(wysczynsz);
                    break;
                case 16:
                    System.out.println("Czy jest balkon? (1/0): ");
                    String balk = input.nextLine();
                    setBalkon(balk);
                    break;
                case 17:
                    System.out.println("Czy jest ogrod? (1/0): ");
                    String ogr = input.nextLine();
                    setOgrod(ogr);
                    break;
                case 18:
                    System.out.println("Czy sa miejsca parkingowe naziemne?(1/0): ");
                    String mpn = input.nextLine();
                    setMiejscaParkingoweNaziemne(mpn);
                    break;
                case 19:
                    System.out.println("Czy sa miejsca parkingowe podziemne?(1/0): ");
                    String mpp = input.nextLine();
                    setMiejscaParkingowePodziemne(mpp);
                    break;
                case 20:
                    System.out.println("Czy jest piwnica?(1/0): ");
                    String piwn = input.nextLine();
                    setPiwnica(piwn);
                    break;
                case 21:
                    System.out.println("Czy jest winda?(1/0): ");
                    String wind = input.nextLine();
                    setWinda(wind);
                    break;
                case 22:
                    System.out.println("Czy jest to osiedle strzezone?(1/0): ");
                    String os = input.nextLine();
                    setOsiedleStrzezone(os);
                    break;
                case 23:
                    System.out.println("Czy jest to rynek wtorny?(1/0): ");
                    String rw = input.nextLine();
                    setRynekWtorny(rw);
                    break;
                case 24:
                    System.out.println("Podaj nowy opis: ");
                    String op = input.nextLine();
                    setOpis(op);
                    break;
                case 25:
                    System.out.println("Dodaj komentarz: ");
                    String kom = input.nextLine();
                    setKomentarz(kom);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Komunikat nr. 421!\nUPS! Cos poszlo nie tak!");

            }
        }
    }
    @Override
    public void wyczysc()
    {
        osoba.setKontakt("","","","");

    }

    @Override
    public void zapisz()
    {
        try
        {
            FileWriter plik = new FileWriter("baza.txt", true);
            PrintWriter out = new PrintWriter(plik);

            out.println("Klient;" + ID +";"+ osoba.getImie() +";"+  osoba.getNazwisko() +";"+  osoba.getMail()+";"+
                    osoba.getNrKontaktowy() +";"+ getCena() +";"+ getCzynsz() +";"+ getPowCalkowita() +";"+ getDzielnica() +";"+ getOsiedle() +";"+
                    getTyp() +";"+ getPietroNaIle() +";"+ getIloscPokoi() +";"+ getIloscLazienek() +";"+ getWysokoscCzynszu() +";"+ getBalkon() +";"+
                    getOgrod() +";"+ getMiejscaParkingoweNaziemne() +";"+ getMiejscaParkingowePodziemne() +";"+ getPiwnica() +";"+ getWinda() +";"
                    + getOsiedleStrzezone() +";" + getRynekWtorny() +";"+ getOpis() +";"+ getKomentarz() );
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Blad podczas zapisu klienta");
        }
    }
    // GETERY SETERY

    public Kontakt getOsoba() {
        return osoba;
    }

    public void setOsoba(Kontakt osoba) {
        this.osoba = osoba;
    }



}