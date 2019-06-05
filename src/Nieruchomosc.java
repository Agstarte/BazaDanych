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
        int intcena = Integer.parseInt(getCena());
        int intpow = Integer.parseInt(getPowCalkowita());
        int cenametr = (intcena/intpow);
        this.cenaZaMetr2 = Integer.toString(cenametr);
    }


    @Override
    public  void pokazSzczegoly ()
    {
        System.out.println("\nNieruchomosc: " + this.ID);
        wlasciciel.wyswietlKontakt();
        adres.wyswietlAdres();
        System.out.println("Data dodania: " + this.dataDodania + "\nCena za m2: " + this.cenaZaMetr2  +"\nCena: " + getCena() + "\nCzynsz: " + getCzynsz()+ "\nPow. calkowita: " + getPowCalkowita()
                + "\nDzielnica: " + getDzielnica() + "\nOsiedle: " + getOsiedle() + "\nTyp: " + getTyp() + "\nPietro/na ile pieter: " + getPietroNaIle()
                + "\nIlosc pokoi: " + getIloscPokoi()+ "\nIlosc lazienek: " + getIloscLazienek() + "\nWysokosc czynszu: " + getWysokoscCzynszu() +
                "\nCzy balkon?: " + getBalkon() + "\nCzy ogrod?: " + getOgrod() + "\nMiejsca parkingowe naziemne: " + getMiejscaParkingoweNaziemne() +
                "\nMiejsca parkingowe podziemne: " + getMiejscaParkingowePodziemne() + "\nCzy piwnica?: " + getPiwnica() + "\nCzy winda?: " + getWinda() +
                "\nCzy osiedle strzezone?: " + getOsiedleStrzezone() + "\nCzy rynek wtďż˝rny?: " + getRynekWtorny()
                + "\nOpis: " + getOpis() + "\nKomentarze: " + getKomentarz() );
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
                wlasciciel.setImie(imie);
                break;
            case 3:
                System.out.println("Podaj nowe nazwisko: ");
                String nazwisko = input.nextLine();
                wlasciciel.setNazwisko(nazwisko);
                break;
            case 4:
                System.out.println("Podaj nowy e-mail: ");
                String mail = input.nextLine();
                wlasciciel.setMail(mail);
                break;
            case 5:
                System.out.println("Podaj nowy nr. telefonu: ");
                String tel = input.nextLine();
                wlasciciel.setNrKontaktowy(tel);
                break;
            case 6:
                System.out.println("Podaj nowa ulice: ");
                String ulica = input.nextLine();
                adres.setUlica(ulica);
                break;
            case 7:
                System.out.println("Podaj nowy kod pocztowy: ");
                String kod = input.nextLine();
                adres.setKodPocztowy(kod);
                break;
            case 8:
                System.out.println("Podaj nowy numer domu: ");
                String nrd = input.nextLine();
                adres.setNrDomu(nrd);
                break;
            case 9:
                System.out.println("Podaj nowy numer mieszkania: ");
                String nrm = input.nextLine();
                adres.setNrMieszkania(nrm);
                break;
            case 10:
                System.out.println("Podaj nowa date dodania: ");
                String data = input.nextLine();
                this.dataDodania = data;
                break;
            case 11:
                System.out.println("Podaj nowa cene: ");
                String cen = input.nextLine();
                setCena(cen);
                break;
            case 12:
                System.out.println("Podaj nowy czynsz: ");
                String czyn = input.nextLine();
                setCzynsz(czyn);
                break;
            case 13:
                System.out.println("Podaj nowa pow. calkowita: ");
                String pow = input.nextLine();
                setPowCalkowita(pow);
                break;
            case 14:
                System.out.println("Podaj nowa dzielnice: ");
                String dzielnia = input.nextLine();
                setDzielnica(dzielnia);
                break;
            case 15:
                System.out.println("Podaj nowe osiedle: ");
                String osied = input.nextLine();
                setOsiedle(osied);
                break;
            case 16:
                System.out.println("Podaj nowy typ nieruchomosci: ");
                String typek = input.nextLine();
                setTyp(typek);
                break;
            case 17:
                System.out.println("Podaj nowe pietro/na ile pieter: ");
                String pietro = input.nextLine();
                setPietroNaIle(pietro);
                break;
            case 18:
                System.out.println("Podaj nowa ilosc pokoi: ");
                String iloscp = input.nextLine();
                setIloscPokoi(iloscp);
                break;
            case 19:
                System.out.println("Podaj nowa ilosc lazienek:");
                String iloscl = input.nextLine();
                setIloscLazienek(iloscl);
                break;
            case 20:
                System.out.println("Podaj nowa wysokosc czynszu: ");
                String wysczynsz = input.nextLine();
                setWysokoscCzynszu(wysczynsz);
                break;
            case 21:
                System.out.println("Czy jest balkon? (1/0): ");
                String balk = input.nextLine();
                setBalkon(balk);
                break;
            case 22:
                System.out.println("Czy jest ogrod? (1/0): ");
                String ogr = input.nextLine();
                setOgrod(ogr);
                break;
            case 23:
                System.out.println("Czy sa miejsca parkingowe naziemne?(1/0): ");
                String mpn = input.nextLine();
                setMiejscaParkingoweNaziemne(mpn);
                break;
            case 24:
                System.out.println("Czy sa miejsca parkingowe podziemne?(1/0): ");
                String mpp = input.nextLine();
                setMiejscaParkingowePodziemne(mpp);
                break;
            case 25:
                System.out.println("Czy jest piwnica?(1/0): ");
                String piwn = input.nextLine();
                setPiwnica(piwn);
                break;
            case 26:
                System.out.println("Czy jest winda?(1/0): ");
                String wind = input.nextLine();
                setWinda(wind);
                break;
            case 27:
                System.out.println("Czy jest to osiedle strzezone?(1/0): ");
                String os = input.nextLine();
                setOsiedleStrzezone(os);
                break;
            case 28:
                System.out.println("Czy jest to rynek wtorny?(1/0): ");
                String rw = input.nextLine();
                setRynekWtorny(rw);
                break;
            case 29:
                System.out.println("Podaj nowy opis: ");
                String op = input.nextLine();
                setOpis(op);
                break;
            case 30:
                System.out.println("Dodaj komentarz: ");
                String kom = input.nextLine();
                setKomentarz(kom);
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
            out.println("Nieruchomosc;" + ID +";"+ wlasciciel.getImie() +";"+ wlasciciel.getNazwisko()
                    +";"+ wlasciciel.getMail() +";"+ wlasciciel.getNrKontaktowy() +";"+ adres.getUlica() +";"+ adres.getKodPocztowy()
                    +";"+ adres.getNrDomu() +";"+ adres.getNrMieszkania() +";"+ dataDodania +";"+ getCena() +";"+ getCzynsz() +";"+
                    getPowCalkowita() +";"+ getDzielnica() +";"+ getOsiedle() +";"+ getTyp() +";"+ getPietroNaIle() +";"+ getIloscPokoi() +";"+ getIloscLazienek()
                    +";"+ getWysokoscCzynszu() +";"+ getBalkon() +";"+ getOgrod() +";"+ getMiejscaParkingoweNaziemne() +";"+ getMiejscaParkingowePodziemne()
                    +";"+ getPiwnica() +";"+ getWinda() +";"+ getOsiedleStrzezone() +";" + getRynekWtorny() +";"+ getOpis() +";"+ getKomentarz() );

            out.close();

        }
        catch(IOException e)
        {
            System.out.println("Blad podczas zapisu nieruchomosci");
        }
    }


    public Kontakt getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(Kontakt wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(String dataDodania) {
        this.dataDodania = dataDodania;
    }

    public String getCenaZaMetr2() {
        return cenaZaMetr2;
    }

}