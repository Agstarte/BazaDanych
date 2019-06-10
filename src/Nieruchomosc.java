import java.util.Scanner;
import java.io.*;


public class Nieruchomosc extends Rekord{


    private Kontakt wlasciciel;
    private Adres adres;
    private String dataDodania;
    private String cenaZaMetr2;

    
    /*
                KOLEJNOSC PODAWANIA DANYCH DO KONSTRUKTORA!!! :
    1. ID  2. imiďż˝  3. nazwisko  4. email  5.  telefon  6. ulica  7. kod pocztowy  8. nr. domu  9. nr. mieszkania  10. data dodania 
    11. cena  12. czynsz  13. powierzchnia calkowita  14. dzielnica  15.  osiedle  16. typ  17. piďż˝tro/na ile  18. iloďż˝ďż˝ pokoi  
    19. iloďż˝ďż˝ ďż˝azienek  20. wysokosc czynszu  21. balkon?  22. ogrďż˝d?  23. miejsca parkingowe naziemne  24. miejsca parkingowe podziemne 
    25. piwnica  26. winda  27.  osiedle strzeďż˝one  28. rynek wtďż˝rny  29. opis  30. komentarze
    
    */


    public Nieruchomosc(String ID, String imie, String nazwisko, String email, String tel, String ul, String kod, String nrD, String nrM,
                        String dataDodania, String cena, String czynsz, String powCalkowita, String dzielnica, String osiedle, String typ, String pietroNaIle,
                        String iloscPokoi, String iloscLazienek, String wysokoscCzynszu, String balkon, String ogrod, String miejscaParkingoweNaziemne,
                        String miejscaParkingowePodziemne, String piwnica, String winda, String osiedleStrzezone, String rynekWtorny, String opis, String komentarz)
    {
        super(ID, cena, czynsz, powCalkowita, dzielnica, osiedle, typ, pietroNaIle, iloscPokoi, iloscLazienek, wysokoscCzynszu, balkon, ogrod, miejscaParkingoweNaziemne, miejscaParkingowePodziemne, piwnica, winda, osiedleStrzezone, rynekWtorny, opis, komentarz);
        this.wlasciciel = new Kontakt (imie, nazwisko, email, tel);
        this.adres = new Adres (ul,kod,nrD,nrM);
        this.dataDodania = dataDodania;
        int intcena = Integer.parseInt(this.cena);
        int intpow = Integer.parseInt(this.powCalkowita);
        int cenametr = (intcena/intpow);
        this.cenaZaMetr2 = Integer.toString(cenametr);
    }


    @Override
    public  void pokazSzczegoly ()
    {
        System.out.println("\nNieruchomosc: " + this.ID);
        wlasciciel.wyswietlKontakt();
        adres.wyswietlAdres();
        System.out.println("Data dodania: " + this.dataDodania + "\nCena za m2: " + this.cenaZaMetr2  +"\nCena: " + this.cena + "\nCzynsz: " + this.czynsz+ "\nPow. calkowita: " + this.powCalkowita
                + "\nDzielnica: " + this.dzielnica + "\nOsiedle: " + this.osiedle + "\nTyp: " + this.typ + "\nPietro/na ile pieter: " + this.pietroNaIle
                + "\nIlosc pokoi: " + this.iloscPokoi+ "\nIlosc lazienek: " + this.iloscLazienek + "\nWysokosc czynszu: " + this.wysokoscCzynszu +
                "\nCzy balkon?: " + this.balkon + "\nCzy ogrod?: " + this.ogrod + "\nMiejsca parkingowe naziemne: " + this.miejscaParkingoweNaziemne +
                "\nMiejsca parkingowe podziemne: " + this.miejscaParkingowePodziemne + "\nCzy piwnica?: " + this.piwnica + "\nCzy winda?: " + this.winda +
                "\nCzy osiedle strzezone?: " + this.osiedleStrzezone + "\nCzy rynek wtďż˝rny?: " + this.rynekWtorny
                + "\nOpis: " + this.opis + "\nKomentarze: " + this.komentarz );
    }


    @Override
    public void edytuj()  // ZMIENIONE
    {
        int number = 1;
        System.out.println("Tak wygladaja dane wybraj nieruchomosci: ");//wyswietla wszystkie pola
        pokazSzczegoly();

        while (number != 0)
        {
        System.out.println("Wybierz pole do edycji: (wpisz cyfre od 1 do 30) \n");

        System.out.println("1. ID  2. imie  3. nazwisko  4. email  5.  telefon  6. ulica  7. kod pocztowy  8. nr. domu  9. nr. mieszkania  \n"
                + "10. data dodania 11. cena  12. czynsz  13. powierzchnia calkowita  14. dzielnica  15.  osiedle  16. typ  17. pietro/na ile  \n"
                + "18. ilosc pokoi 19. ilosc lazienek  20. wysokosc czynszu  21. balkon?  22. ogrod?  23. miejsca parkingowe naziemne  \n"
                + "24. miejsca parkingowe podziemne 25. piwnica  26. winda  27.  osiedle strzezone  28. rynek wtorny  29. opis  30. komentarze\nWpisz \"0\" zeby wyjsc");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine(); // wczytujemy numerek z klawiatury
        number = Integer.parseInt(text);

        switch (number){         //switch ktore chcesz zmienic
            case 1:
                System.out.println("Podaj nowe ID: ");
                String id = input.nextLine();
                this.ID = id;
                break;
            case 2:
                System.out.println("Podaj nowe imie: ");
                String imie = input.nextLine();
                this.wlasciciel.imie=imie;
                break;
            case 3:
                System.out.println("Podaj nowe nazwisko: ");
                String nazwisko = input.nextLine();
                this.wlasciciel.nazwisko=nazwisko;
                break;
            case 4:
                System.out.println("Podaj nowy e-mail: ");
                String mail = input.nextLine();
                this.wlasciciel.mail=mail;
                break;
            case 5:
                System.out.println("Podaj nowy nr. telefonu: ");
                String tel = input.nextLine();
                wlasciciel.nrKontaktowy=tel;
                break;
            case 6:
                System.out.println("Podaj nowa ulice: ");
                String ulica = input.nextLine();
                this.adres.ulica=ulica;
                break;
            case 7:
                System.out.println("Podaj nowy kod pocztowy: ");
                String kod = input.nextLine();
                this.adres.kodPocztowy=kod;
                break;
            case 8:
                System.out.println("Podaj nowy numer domu: ");
                String nrd = input.nextLine();
                this.adres.nrDomu=nrd;
                break;
            case 9:
                System.out.println("Podaj nowy numer mieszkania: ");
                String nrm = input.nextLine();
                this.adres.nrMieszkania=nrm;
                break;
            case 10:
                System.out.println("Podaj nowa date dodania: ");
                String data = input.nextLine();
                this.dataDodania = data;
                break;
            case 11:
                System.out.println("Podaj nowa cene: ");
                String cen = input.nextLine();
                this.cena = cen;
                break;
            case 12:
                System.out.println("Podaj nowy czynsz: ");
                String czyn = input.nextLine();
                this.czynsz = czyn;
                break;
            case 13:
                System.out.println("Podaj nowa pow. calkowita: ");
                String pow = input.nextLine();
                this.powCalkowita = pow;
                break;
            case 14:
                System.out.println("Podaj nowa dzielnice: ");
                String dzielnia = input.nextLine();
                this.dzielnica = dzielnia;
                break;
            case 15:
                System.out.println("Podaj nowe osiedle: ");
                String osied = input.nextLine();
                this.osiedle = osied;
                break;
            case 16:
                System.out.println("Podaj nowy typ nieruchomosci: ");
                String typek = input.nextLine();
                this.typ = typek;
                break;
            case 17:
                System.out.println("Podaj nowe pietro/na ile pieter: ");
                String pietro = input.nextLine();
                this.pietroNaIle = pietro;
                break;
            case 18:
                System.out.println("Podaj nowa ilosc pokoi: ");
                String iloscp = input.nextLine();
                this.iloscPokoi = iloscp;
                break;
            case 19:
                System.out.println("Podaj nowa ilosc lazienek:");
                String iloscl = input.nextLine();
                this.iloscLazienek = iloscl;
                break;
            case 20:
                System.out.println("Podaj nowa wysokosc czynszu: ");
                String wysczynsz = input.nextLine();
                this.wysokoscCzynszu = wysczynsz;
                break;
            case 21:
                System.out.println("Czy jest balkon? (1/0): ");
                String balk = input.nextLine();
                this.balkon = balk;
                break;
            case 22:
                System.out.println("Czy jest ogrod? (1/0): ");
                String ogr = input.nextLine();
                this.ogrod = ogr;
                break;
            case 23:
                System.out.println("Czy sa miejsca parkingowe naziemne?(1/0): ");
                String mpn = input.nextLine();
                this.miejscaParkingoweNaziemne = mpn;
                break;
            case 24:
                System.out.println("Czy sa miejsca parkingowe podziemne?(1/0): ");
                String mpp = input.nextLine();
                this.miejscaParkingoweNaziemne = mpp;
                break;
            case 25:
                System.out.println("Czy jest piwnica?(1/0): ");
                String piwn = input.nextLine();
                this.piwnica = piwn;
                break;
            case 26:
                System.out.println("Czy jest winda?(1/0): ");
                String wind = input.nextLine();
                this.winda = wind;
                break;
            case 27:
                System.out.println("Czy jest to osiedle strzezone?(1/0): ");
                String os = input.nextLine();
                this.osiedleStrzezone = os;
                break;
            case 28:
                System.out.println("Czy jest to rynek wtorny?(1/0): ");
                String rw = input.nextLine();
                this.rynekWtorny = rw;
                break;
            case 29:
                System.out.println("Podaj nowy opis: ");
                String op = input.nextLine();
                this.opis = op;
                break;
            case 30:
                System.out.println("Dodaj komentarz: ");
                String kom = input.nextLine();
                this.komentarz = kom;
                break;
            case 0:
                break;
            default:
                System.out.println("Komunikat nr. 421!\nUPS! Cos poszlo nie tak!");

        }}
    }



    @Override
    public void zapisz()
    {
        try
        {
            FileWriter plik = new FileWriter("baza.txt", true);
            PrintWriter out = new PrintWriter(plik);
            out.println("Nieruchomosc;" + ID +";"+ wlasciciel.imie +";"+ wlasciciel.nazwisko
                    +";"+ wlasciciel.mail +";"+ wlasciciel.nrKontaktowy +";"+ adres.ulica +";"+ adres.kodPocztowy
                    +";"+ adres.nrDomu +";"+ adres.nrMieszkania +";"+ dataDodania +";"+ cena +";"+ czynsz +";"+
                    powCalkowita +";"+ dzielnica +";"+ osiedle +";"+ typ +";"+ pietroNaIle +";"+ iloscPokoi +";"+ iloscLazienek
                    +";"+ wysokoscCzynszu +";"+ balkon +";"+ ogrod +";"+ miejscaParkingoweNaziemne +";"+ miejscaParkingowePodziemne
                    +";"+ piwnica +";"+ winda +";"+ osiedleStrzezone +";" + rynekWtorny +";"+ opis +";"+ komentarz );

            out.close();

        }
        catch(IOException e)
        {
            System.out.println("Blad podczas zapisu nieruchomosci");
        }
    }


}