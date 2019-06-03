import java.io.*;
import java.util.Scanner;


public class Logowanie implements ILogowanie{

    public static int login (String log, String ha)
    {
        try
        {
            FileReader fr = new FileReader("loginy.txt");
            BufferedReader in = new BufferedReader(fr);

            String l = in.readLine();
            String h = in.readLine();
            if(l.equals(log) && h.equals(ha))
                return 1;

        }
        catch(IOException e)
        {
            System.out.println("Nie udalo sie sprawdzic loginu");
        }
        return 0;
    }


    public void Loguj () // ZMIENIONE TROCHE, POUSUWAŁAM PO 1 GETLINIE!
    {

        int admin = login("admin", "admin");
        if(admin == 0) {
            System.out.println("nie masz uprawnien do korzystania z programu");
        }
        else{
            IObslugaBazyAdmin testowa = new ObslugaBazy();
            int wybor;
            SystemDopasowywania dopas = new SystemDopasowywania();
            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Co chcesz zrobic?\n 0.Wyjscie\n 1.Przegladaj klientow\n 2.Przegladaj nieruchomosci\n 3.Edytuj rekord (po indeksie)" +
                        "\n 4.Dodaj rekord\n 5.Usun rekord(po ID)\n 6.Znajdz klientow ktorzy moga byc chetni na kupienie danej nieruchomosci\n" +
                        " 7.Znajdz nieruchomosci spelniajace wymagania klientow \n 8. Pokaz szczegoly (po ID)\n 9. Wyczysc rekord (po ID)");
                wybor = scan.nextInt();
                switch(wybor){
                    case 1:
                        testowa.przegladajKlientow();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    case 2:
                        testowa.przegladajNieruchomosci();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    case 3:
                        System.out.println("Wybierz ID rekordu: ");
                        scan.nextLine();
                        String id = scan.nextLine();
                        testowa.edytujRekord(id);   // ZMIENIONE
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        testowa.zapiszBaze();
                        scan.nextLine();
                        break;
                    case 4:
                        testowa.dodajRekord();
                        testowa.zapiszBaze();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        testowa.zapiszBaze();
                        scan.nextLine();
                        break;
                    case 5:
                        System.out.println("Podaj ID rekordu do usuniecia");
                        scan.nextLine();
                        String szukane = scan.nextLine();
                        int znalezione = testowa.wyszukajRekord(szukane);
                        if(znalezione == -1)
                        {
                            System.out.println("Nie ma rekordku o takim ID");
                        }
                        else
                        {
                            testowa.usunRekord(testowa.getBaza().get(znalezione));
                            testowa.zapiszBaze();
                        }
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    case 6:
                        System.out.println("Podaj ID nieruchomosci");
                        scan.nextLine();
                        String nier = scan.nextLine();
                        int znaleziona = testowa.wyszukajRekord(nier);
                        if(znaleziona == -1 || testowa.getBaza().get(znaleziona) instanceof Klient)
                        {
                            System.out.println("Nie ma nieruchomosci o takim ID");
                        }
                        else
                        {
                            dopas.dopasujKlienta(testowa.getBaza().get(znaleziona), 1);
                        }
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    case 7:
                        System.out.println("Podaj ID klienta");
                        scan.nextLine();
                        String klient = scan.nextLine();
                        int znaleziony = testowa.wyszukajRekord(klient);
                        if(znaleziony == -1 || testowa.getBaza().get(znaleziony) instanceof Nieruchomosc)
                        {
                            System.out.println("Nie ma klienta o takim ID");
                        }
                        else
                        {
                            dopas.dopasujNieruchomosc(testowa.getBaza().get(znaleziony), 1);
                        }
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    case 8:
                        System.out.println("Podaj ID rekordu, ktorego szczegoly chcesz zobaczyc");
                        scan.nextLine();
                        String x = scan.nextLine();
                        testowa.pokazRekord(x);
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    case 9:
                        System.out.println("Podaj ID rekordu, ktory chcesz wyczyscic");
                        scan.nextLine();
                        String iD = scan.nextLine();
                        testowa.wyczyscRekord(testowa.getBaza().get(testowa.wyszukajRekord(iD)));
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    default:
                        System.out.println("Niepoprawny wybor");
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        scan.nextLine();
                        break;
                    case 0:
                }}while(wybor!=0);
            testowa.zapiszBaze();
    }

}}
