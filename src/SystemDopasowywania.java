public class SystemDopasowywania implements ISystemDopasowywania{

    ObslugaBazy obslugaBazy = new ObslugaBazy();  // ZMIENIONE


    public SystemDopasowywania()
    {
        this.obslugaBazy = obslugaBazy;
    }  // ZMIENIONE

    //porownuje nieruchomosc i wymagania klienta, sprawdza ile pol sie zgadza
    public static int sprawdzDopasowanie (Rekord klient, Rekord nier)
    {

        int pasujace=0;
        if(nier instanceof Nieruchomosc)
        {
            String holder[];

            holder = klient.cena.split("-");

            if(holder.length == 1) {
                if (klient.cena.equals(nier.cena))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.cena)) && (Integer.parseInt(nier.cena) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.czynsz.split("-");
            if(holder.length == 1) {
                if(klient.czynsz.equals(nier.czynsz))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.czynsz)) && (Integer.parseInt(nier.czynsz) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.powCalkowita.split("-");
            if(holder.length == 1) {
                if(klient.powCalkowita.equals(nier.powCalkowita))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.powCalkowita)) && (Integer.parseInt(nier.powCalkowita) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            if(klient.dzielnica.equals(nier.dzielnica))
                pasujace++;
            if(klient.osiedle.equals(nier.osiedle))
                pasujace++;
            if(klient.typ.equals(nier.typ))
                pasujace++;
            if(klient.pietroNaIle.equals(nier.pietroNaIle))
                pasujace++;
            holder = klient.iloscPokoi.split("-");
            if(holder.length == 1) {
                if(klient.iloscPokoi.equals(nier.iloscPokoi))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.iloscPokoi)) && (Integer.parseInt(nier.iloscPokoi) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.iloscLazienek.split("-");
            if(holder.length == 1) {
                if(klient.iloscLazienek.equals(nier.iloscLazienek))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.iloscLazienek)) && (Integer.parseInt(nier.iloscLazienek) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.wysokoscCzynszu.split("-");
            if(holder.length == 1) {
                if(klient.wysokoscCzynszu.equals(nier.wysokoscCzynszu))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.wysokoscCzynszu)) && (Integer.parseInt(nier.wysokoscCzynszu) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            if(klient.balkon.equals(nier.balkon))
                pasujace++;
            if(klient.ogrod.equals(nier.ogrod))
                pasujace++;
            if(klient.miejscaParkingoweNaziemne.equals(nier.miejscaParkingoweNaziemne))
                pasujace++;
            if(klient.miejscaParkingowePodziemne.equals(nier.miejscaParkingowePodziemne))
                pasujace++;
            if(klient.piwnica.equals(nier.piwnica))
                pasujace++;
            if(klient.winda.equals(nier.winda))
                pasujace++;
            if(klient.osiedleStrzezone.equals(nier.osiedleStrzezone))
                pasujace++;
            if(klient.rynekWtorny.equals(nier.rynekWtorny))
                pasujace++;
        }
        return pasujace;
    }

    /*wypisuje na ekran ID kazdego klienta, ktorego wymagania z podana
    dokladnoscia zgadzaja sie z opisem nieruchomosci*/


    public  void dopasujKlientow (String ID, int dokladnosc)
    {

        int znaleziona = obslugaBazy.wyszukajRekord(ID);
        if (znaleziona == -1 || obslugaBazy.getBaza().get(znaleziona) instanceof Klient) {
            System.out.println("Nie ma nieruchomosci o takim ID");
        } else {

            for (int i = 0; i < obslugaBazy.getBaza().size(); ++i) {
                Rekord klient = obslugaBazy.getBaza().get(i);
                if (klient instanceof Klient) {
                    int pasujace = SystemDopasowywania.sprawdzDopasowanie(klient, obslugaBazy.getBaza().get(znaleziona));

                    if (pasujace >= dokladnosc) //jesli elemntow spelniajacych wymagania jest dosc to wypisze na ekran
                        System.out.println(klient.ID + " pasujacych pol:" + pasujace);
                }
            }
        }
    }

    //analogicznie do dopasujKlienta
    public  void dopasujNieruchomosci (String ID, int dokladnosc)
    {
        int znaleziony = obslugaBazy.wyszukajRekord(ID);
        if (znaleziony == -1 || obslugaBazy.getBaza().get(znaleziony) instanceof Nieruchomosc) {
            System.out.println("Nie ma klienta o takim ID");
        } else {
            for (int i = 0; i < obslugaBazy.getBaza().size(); ++i) {
                Rekord nieruchomosc = obslugaBazy.getBaza().get(i);
                if (nieruchomosc instanceof Nieruchomosc) {
                    int pasujace = SystemDopasowywania.sprawdzDopasowanie(obslugaBazy.getBaza().get(znaleziony), nieruchomosc);

                    if (pasujace >= dokladnosc) //jesli elemntow spelniajacych wymagania jest dosc to wypisze na ekran
                        System.out.println(nieruchomosc.ID + " pasujacych pol:" + pasujace);
                }
            }
        }
    }


}
