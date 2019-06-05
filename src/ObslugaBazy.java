import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;


@SuppressWarnings("Duplicates")
public class ObslugaBazy implements IObslugaBazyAdmin, IObslugaBazy{


    private ArrayList<Rekord> baza;


    protected ObslugaBazy () //wczytuje ostatni stan bazy
    {
        String holder1; // wczytywana linijka z pliku
        String holder2[]; // podzielona linijka z pliku w formie tablicy
        Rekord holder3; // nowy obiekt

        baza = new ArrayList<>(); //tablica bazy

        try{
            FileReader fr = new FileReader("baza.txt");
            BufferedReader br;
            br = new BufferedReader(fr);

            while ((holder1 = br.readLine()) != null) // wczytywanie kolejnych linijek
            {
                holder2 = holder1.split(";"); // dzielenie linijki na argumenty


                if("Klient".equals(holder2[0])) // dodawanie klienta / nieruchomości do bazy
                {
                    holder3 = new Klient(holder2[1],holder2[2],holder2[3],holder2[4],holder2[5],holder2[6],holder2[7],holder2[8],holder2[9],holder2[10],holder2[11],holder2[12],holder2[13],holder2[14],holder2[15],holder2[16],holder2[17],holder2[18],holder2[19],holder2[20],holder2[21],holder2[22],holder2[23],holder2[24],holder2[25]);
                    baza.add(holder3);
                }
                else {
                    holder3 = new Nieruchomosc(holder2[1],holder2[2],holder2[3],holder2[4],holder2[5],holder2[6],holder2[7],holder2[8],holder2[9],holder2[10],holder2[11],holder2[12],holder2[13],holder2[14],holder2[15],holder2[16],holder2[17],holder2[18],holder2[19],holder2[20],holder2[21],holder2[22],holder2[23],holder2[24],holder2[25],holder2[26],holder2[27],holder2[28],holder2[29],holder2[30]);
                    baza.add(holder3);
                }
            }
            br.close();
        }catch (IOException e){
            System.out.println("File not found");
        }
    }


    public void dodajRekord ()
    {
        System.out.println("Co chcesz dodac? \n Wpisz \"K\" jesli klienta lub \"N\" jesli nieruchomosc");
        Scanner input = new Scanner(System.in);
        String co = input.nextLine();
        if (co.equals("K")||co.equals("k")||co.equals("N")||co.equals("n"))
        {
                String ul="", kod="", nrd="", nrm="", data="";

                System.out.print("Podaj ID "); if (co.equals("K")||co.equals("k")) {System.out.println("klienta: ");} else System.out.println("nieruchomosci: ");
                String id = input.nextLine();

                System.out.println("Podaj imie: ");
                String im = input.nextLine();

                System.out.println("Podaj nazwisko: ");
                String nazw = input.nextLine();

                System.out.println("Podaj e-mail: ");
                String mail = input.nextLine();

                System.out.println("Podaj nr. telefonu: ");
                String tel = input.nextLine();

                if (co.equals("N")||co.equals("n"))
                {
                        System.out.println("Podaj nowa ulice: ");
                        ul = input.nextLine();

                        System.out.println("Podaj kod pocztowy: ");
                        kod = input.nextLine();

                        System.out.println("Podaj numer domu: ");
                        nrd = input.nextLine();

                        System.out.println("Podaj numer mieszkania: ");
                        nrm = input.nextLine();

                        Date date = new Date();
                        data = date.toString();

                }

                System.out.println("Podaj cene nieruchomosci: "); if (co.equals("K")||co.equals("k")) System.out.print("(zakres X-X): ");
                String cen = input.nextLine();

                System.out.println("Podaj czynsz: "); if (co.equals("K")||co.equals("k")) System.out.print("(zakres X-X): ");
                String czyn = input.nextLine();

                System.out.println("Podaj pow. calkowita: "); if (co.equals("K")||co.equals("k")) System.out.print("(zakres X-X): ");
                String pow = input.nextLine();

                System.out.println("Podaj dzielnice: ");
                String dzielnia = input.nextLine();

                System.out.println("Podaj osiedle: ");
                String osied = input.nextLine();

                System.out.println("Podaj typ nieruchomosci: ");
                String typek = input.nextLine();

                System.out.println("Podaj pietro/na ile pieter: ");
                String pietro = input.nextLine();

                System.out.println("Podaj ilosc pokoi: "); if (co.equals("K")||co.equals("k")) System.out.print("(zakres X-X): ");
                String iloscp = input.nextLine();

                System.out.println("Podaj ilosc lazienek:"); if (co.equals("K")||co.equals("k")) System.out.print("(zakres X-X): ");
                String iloscl = input.nextLine();

                System.out.println("Podaj wysokosc czynszu: "); if (co.equals("K")||co.equals("k")) System.out.print("(zakres X-X): ");
                String wysczynsz = input.nextLine();

                System.out.println("Czy balkon? (1/0): ");
                String balk = input.nextLine();

                System.out.println("Czy ogrod? (1/0): ");
                String ogr = input.nextLine();

                System.out.println("Czy miejsca parkingowe naziemne?(1/0): ");
                String mpn = input.nextLine();

                System.out.println("Czy miejsca parkingowe podziemne?(1/0): ");
                String mpp = input.nextLine();

                System.out.println("Czy piwnica?(1/0): ");
                String piwn = input.nextLine();

                System.out.println("Czy winda?(1/0): ");
                String wind = input.nextLine();

                System.out.println("Czy osiedle strzezone?(1/0): ");
                String os = input.nextLine();

                System.out.println("Czy rynek wtorny?(1/0): ");
                String rw = input.nextLine();

                System.out.println("Podaj opis: ");
                String op = input.nextLine();

                System.out.println("Dodaj komentarz: ");
                String kom = input.nextLine();

                if (co.equals("K")||co.equals("k"))
                {
                    Klient klient = new Klient(id, im, nazw, mail, tel, cen, czyn, pow, dzielnia, osied, typek, pietro, iloscp, iloscl, wysczynsz, balk, ogr, mpn, mpp, piwn, wind, os, rw, op, kom);
                    baza.add(klient);
                }
                else
                {
                    Nieruchomosc nieruchomosc = new Nieruchomosc (id, im, nazw, mail, tel, ul, kod, nrd, nrm, data, cen, czyn, pow, dzielnia, osied, typek, pietro, iloscp, iloscl, wysczynsz, balk, ogr, mpn, mpp, piwn, wind, os, rw, op, kom);
                    baza.add(nieruchomosc);
                }

        }else System.out.println("Podales zly znak");
    }

    public void pokazRekord(String ID)
    {
        if (wyszukajRekord(ID) != -1) {
            baza.get(wyszukajRekord(ID)).pokazSzczegoly();
        } else System.out.println("Nie ma Rekordu o takim ID");
    }

    public void przegladajKlientow()
    {
        for(int i=0; i<baza.size(); ++i)
            if(baza.get(i) instanceof Klient)
                baza.get(i).pokazSzczegoly();
    }

    public void przegladajNieruchomosci()
    {
        for(int i=0; i<baza.size(); ++i)
            if(baza.get(i) instanceof Nieruchomosc)
                baza.get(i).pokazSzczegoly();
    }

    public int wyszukajRekord(String ID) //wyszukuje po id i zwraca indeks
    {
        for(int i=0; i<baza.size(); ++i)
            if(baza.get(i).ID.equals(ID))
                return i;
        return -1;
    }

    public void usunRekord(String ID) //usuwa rekord z tablicy
    {

        int znalezione = wyszukajRekord(ID);
        if(znalezione == -1)
        {
            System.out.println("Nie ma rekordku o takim ID");
        }
        else
        {
            Rekord wywal = getBaza().get(znalezione);
            if(wywal instanceof Klient)
          {
                if(baza.remove(wywal))
                System.out.println("Klient usuniety");
                else
                System.out.println("Nie udalo sie usunac Klienta");
          }
          else
           {
                if(baza.remove(wywal))
                    System.out.println("Nieruchomosc usunieta");
                else
                    System.out.println("Nie udalo sie usunac nieruchomosci");
           }}
    }

    public void edytujRekord(String ID)
    {
        int znalezione = wyszukajRekord(ID);
        if(znalezione == -1)
        {
            System.out.println("Nie ma rekordku o takim ID");
        }
        else
        {
            baza.get(znalezione).edytuj();
        }
    }

    public void zapiszBaze() //przepisuje wszystkie rekordy do pliku tekstowego
    {
        try
        {
            FileWriter plik = new FileWriter("baza.txt"); //czysci plik zrodlowy
            PrintWriter czystka = new PrintWriter(plik);
            czystka.print("");
        }
        catch(IOException e)
        {
            System.out.println("Blad przy zapisywaniu");
        }
        for(int i=0; i<baza.size(); ++i)
            baza.get(i).zapisz(); //wywoluje funkcje zapisujaca klienta/nieruchomosc do pliku
    }


    public ArrayList<Rekord> getBaza() {
        return baza;
    }
}
