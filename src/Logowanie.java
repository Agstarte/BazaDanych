import java.io.*;
import java.util.Scanner;


public class Logowanie implements ILogowanie{

    public static int login ()
    {
        String login, haslo;
        Scanner scan = new Scanner(System.in);



        String temp1; //linijka z pliku
        String[] temp2 = {"",""}; //linijka z pliku po podziale na User/admin, login,haslo

        int fails =0;
        do {
            System.out.print("Login:");
            login = scan.nextLine();
            System.out.print("Haslo:");
            haslo = scan.nextLine();
            try {
                FileReader fr = new FileReader("loginy.txt");
                BufferedReader in = new BufferedReader(fr);
                while ((temp1 = in.readLine()) != null) {
                    temp2 = temp1.split("-");
                    if (login.equals(temp2[1]) && haslo.equals(temp2[2])) {
                        if (temp2[0].equals("A")) //jesli to konto admina to zwraca 1
                            return 1;
                        else
                            return 2;
                    }

                }
                fails++;
                System.out.println("Niepoprawny login lub haslo, sprobuj ponownie \nPozostale proby:" + (5-fails));
            } catch (IOException e) {
                System.out.println("Nie udalo sie sprawdzic loginu");
            }
        }while(fails<5);
        return 0;
    }


    public void Loguj ()
    {

        int admin = login();
        if (admin == 0) {
            System.out.println("nie masz uprawnien do korzystania z programu");
        } else {
            if(admin==1)
                System.out.println("Zalogowales sie jako admin");
            else
                System.out.println("Zalogowales sie jako uzytkownik");

            ObslugaBazy obsluga = new ObslugaBazy();
            IObslugaBazyAdmin obsluga1 = obsluga;
            IObslugaBazy obsluga2 = obsluga;
            ISystemDopasowywania dopas = new SystemDopasowywania();

            String wybor;
            Scanner scan = new Scanner(System.in);

            do {
                System.out.println("Co chcesz zrobic?\n 0.Wyjscie\n 1.Przegladaj klientow\n 2.Przegladaj nieruchomosci \n " +
                        "3.Znajdz klientow ktorzy moga byc chetni na kupienie danej nieruchomosci\n" +
                        " 4.Znajdz nieruchomosci spelniajace wymagania klientow \n 5.Pokaz szczegoly (po ID)");
                if(admin == 1)
                    System.out.println(" 6.Edytuj rekord (po ID)" +"\n 7.Dodaj rekord \n 8.Usun rekord(po ID)");


                wybor = scan.nextLine();

                switch (wybor) {
                    case "1":
                        obsluga2.przegladajKlientow();
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "2":
                        obsluga2.przegladajNieruchomosci();
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
                        obsluga.pokazRekord(x);
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "6":
                        if(admin == 1) {
                            System.out.println("Wybierz ID rekordu: ");
                            scan.nextLine();
                            String id = scan.nextLine();
                            obsluga1.edytujRekord(id);
                            System.out.println("\nKliknij enter zeby przejsc do menu");
                            obsluga.zapiszBaze();
                            enterek();
                            break;
                        }
                    case "7":
                        if(admin == 1) {
                            obsluga1.dodajRekord();
                            obsluga.zapiszBaze();
                            System.out.println("\nKliknij enter zeby przejsc do menu");
                            obsluga.zapiszBaze();
                            enterek();
                            break;
                        }
                    case "8":
                        if(admin ==1) {
                            System.out.println("Podaj ID rekordu do usuniecia");
                            scan.nextLine();
                            String szukane = scan.nextLine();
                            obsluga1.usunRekord(szukane);
                            obsluga.zapiszBaze();
                            System.out.println("\nKliknij enter zeby przejsc do menu");
                            enterek();
                            break;
                        }

                    default:
                        System.out.println("Niepoprawny wybor");
                        System.out.println("\nKliknij enter zeby przejsc do menu");
                        enterek();
                        break;
                    case "0":
                        break;
                }
            } while (!wybor.equals("0"));
            obsluga.zapiszBaze();
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
