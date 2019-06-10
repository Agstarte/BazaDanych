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
        osoba.wyswietlKontakt();
        System.out.println("Wymagana cena: " + this.cena + "\nWymagany czynsz: " + this.czynsz+ "\nWymagana pow. calkowita: " + this.powCalkowita
                + "\nDzielnica: " + this.dzielnica + "\nOsiedle: " + this.osiedle + "\nTyp: " + this.typ + "\nPietro/na ile pieter: " + this.pietroNaIle
                + "\nIlosc pokoi: " + this.iloscPokoi+ "\nIlosc lazienek: " + this.iloscLazienek + "\nWysokosc czynszu: " + this.wysokoscCzynszu +
                "\nCzy balkon?: " + this.balkon + "\nCzy ogrod?: " + this.ogrod + "\nMiejsca parkingowe naziemne: " + this.miejscaParkingoweNaziemne +
                "\nMiejsca parkingowe podziemne: " + this.miejscaParkingowePodziemne + "\nCzy piwnica?: " + this.piwnica + "\nCzy winda?: " + this.winda +
                "\nCzy osiedle strzezone?: " + this.osiedleStrzezone + "\nCzy rynek wtorny?: " + this.rynekWtorny + "\nOpis: " + this.opis + "\nKomentarze: " + this.komentarz + "\n");
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
                    this.osoba.imie=imie;
                    break;
                case 3:
                    System.out.println("Podaj nowe nazwisko: ");
                    String nazwisko = input.nextLine();
                    this.osoba.nazwisko=nazwisko;
                    break;
                case 4:
                    System.out.println("Podaj nowy e-mail: ");
                    String mail = input.nextLine();
                    this.osoba.mail=mail;
                    break;
                case 5:
                    System.out.println("Podaj nowy nr. telefonu: ");
                    String tel = input.nextLine();
                    this.osoba.nrKontaktowy=tel;
                    break;
                case 6:
                    System.out.println("Podaj nowa cene: ");
                    String cen = input.nextLine();
                    this.cena=cen;
                    break;
                case 7:
                    System.out.println("Podaj nowy czynsz: ");
                    String czyn = input.nextLine();
                    this.czynsz=czyn;
                    break;
                case 8:
                    System.out.println("Podaj nowa pow. calkowita: ");
                    String pow = input.nextLine();
                    this.powCalkowita=pow;
                    break;
                case 9:
                    System.out.println("Podaj nowa dzielnice: ");
                    String dzielnia = input.nextLine();
                    this.dzielnica=dzielnia;
                    break;
                case 10:
                    System.out.println("Podaj nowe osiedle: ");
                    String osied = input.nextLine();
                    this.osiedle=osied;
                    break;
                case 11:
                    System.out.println("Podaj nowy typ nieruchomosci: ");
                    String typek = input.nextLine();
                    this.typ=typek;
                    break;
                case 12:
                    System.out.println("Podaj nowe pietro/na ile pieter: ");
                    String pietro = input.nextLine();
                    this.pietroNaIle=pietro;
                    break;
                case 13:
                    System.out.println("Podaj nowa ilosc pokoi: ");
                    String iloscp = input.nextLine();
                    this.iloscPokoi=iloscp;
                    break;
                case 14:
                    System.out.println("Podaj nowa ilosc lazienek:");
                    String iloscl = input.nextLine();
                    this.iloscLazienek=iloscl;
                    break;
                case 15:
                    System.out.println("Podaj nowa wysokosc czynszu: ");
                    String wysczynsz = input.nextLine();
                    this.wysokoscCzynszu=wysczynsz;
                    break;
                case 16:
                    System.out.println("Czy jest balkon? (1/0): ");
                    String balk = input.nextLine();
                    this.balkon=balk;
                    break;
                case 17:
                    System.out.println("Czy jest ogrod? (1/0): ");
                    String ogr = input.nextLine();
                    this.ogrod=ogr;
                    break;
                case 18:
                    System.out.println("Czy sa miejsca parkingowe naziemne?(1/0): ");
                    String mpn = input.nextLine();
                    this.miejscaParkingoweNaziemne=mpn;
                    break;
                case 19:
                    System.out.println("Czy sa miejsca parkingowe podziemne?(1/0): ");
                    String mpp = input.nextLine();
                    this.miejscaParkingowePodziemne=mpp;
                    break;
                case 20:
                    System.out.println("Czy jest piwnica?(1/0): ");
                    String piwn = input.nextLine();
                    this.piwnica=piwn;
                    break;
                case 21:
                    System.out.println("Czy jest winda?(1/0): ");
                    String wind = input.nextLine();
                    this.winda=wind;
                    break;
                case 22:
                    System.out.println("Czy jest to osiedle strzezone?(1/0): ");
                    String os = input.nextLine();
                    this.osiedleStrzezone=os;
                    break;
                case 23:
                    System.out.println("Czy jest to rynek wtorny?(1/0): ");
                    String rw = input.nextLine();
                    this.rynekWtorny=rw;
                    break;
                case 24:
                    System.out.println("Podaj nowy opis: ");
                    String op = input.nextLine();
                    this.opis=op;
                    break;
                case 25:
                    System.out.println("Dodaj komentarz: ");
                    String kom = input.nextLine();
                    this.komentarz=kom;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Komunikat nr. 421!\nUPS! Cos poszlo nie tak!");

            }
        }
    }

    @Override
    public void zapisz()
    {
        try
        {
            FileWriter plik = new FileWriter("baza.txt", true);
            PrintWriter out = new PrintWriter(plik);

            out.println("Klient;" + ID +";"+ osoba.imie +";"+  osoba.nazwisko +";"+  osoba.mail+";"+
                    osoba.nrKontaktowy +";"+ this.cena +";"+ this.czynsz +";"+ this.powCalkowita +";"+ this.dzielnica +";"+ this.osiedle +";"+
                    this.typ +";"+ this.pietroNaIle +";"+ this.iloscPokoi +";"+ this.iloscLazienek +";"+ this.wysokoscCzynszu +";"+ this.balkon +";"+
                    this.ogrod +";"+ this.miejscaParkingoweNaziemne +";"+ this.miejscaParkingowePodziemne +";"+ this.piwnica +";"+ this.winda +";"
                    + this.osiedleStrzezone +";" + this.rynekWtorny +";"+ this.opis +";"+ this.komentarz );
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Blad podczas zapisu klienta");
        }
    }



}