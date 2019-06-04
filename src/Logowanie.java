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


    public void Loguj ()
    {

        int admin = 1;
        if (admin == 0) {
            System.out.println("nie masz uprawnien do korzystania z programu");
        } else {
            ObslugaBazy testowa = new ObslugaBazy();
            IObslugaBazyAdmin testowa1 = testowa;
            IObslugaBazy testowa2 = testowa;
            String wybor;
            ISystemDopasowywania dopas = new SystemDopasowywania();
            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Co chcesz zrobic?\n 0.Wyjscie\n 1.Przegladaj klientow\n 2.Przegladaj nieruchomosci \n " +
                        "3.Znajdz klientow ktorzy moga byc chetni na kupienie danej nieruchomosci\n" +
                        " 4.Znajdz nieruchomosci spelniajace wymagania klientow \n 5.Pokaz szczegoly (po ID) \n 6.Edytuj rekord (po ID)" +
                        "\n 7.Dodaj rekord \n 8.Usun rekord(po ID)");


                wybor = scan.nextLine();

                switch (wybor) {
                    case "1":
                        testowa2.przegladajKlientow();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "2":
                        testowa2.przegladajNieruchomosci();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;

                    case "3":
                        System.out.println("Podaj ID nieruchomosci");
                        scan.nextLine();
                        String nier = scan.nextLine();
                        dopas.dopasujKlientow(nier,1);
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "4":
                        System.out.println("Podaj ID klienta");
                        scan.nextLine();
                        String klient = scan.nextLine();
                        dopas.dopasujNieruchomosci(klient, 1);
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "5":
                        System.out.println("Podaj ID rekordu, ktorego szczegoly chcesz zobaczyc");
                        scan.nextLine();
                        String x = scan.nextLine();
                        testowa.pokazRekord(x);
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "6":
                        System.out.println("Wybierz ID rekordu: ");
                        scan.nextLine();
                        String id = scan.nextLine();
                        testowa.edytujRekord(id);
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        testowa.zapiszBaze();
                        enterek();
                        break;
                    case "7":
                        testowa.dodajRekord();
                        testowa.zapiszBaze();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        testowa.zapiszBaze();
                        enterek();
                        break;
                    case "8":
                        System.out.println("Podaj ID rekordu do usuniecia");
                        scan.nextLine();
                        String szukane = scan.nextLine();
                        testowa.usunRekord(szukane);
                        testowa.zapiszBaze();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "0": break;
                    default:
                        System.out.println("Niepoprawny wybor");
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                }
            } while (wybor != "0");
            testowa.zapiszBaze();
        }
    }
        private void enterek()
        {
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
