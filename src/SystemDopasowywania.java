public class SystemDopasowywania implements ISystemDopasowywania{

    ObslugaBazy b = new ObslugaBazy();  // ZMIENIONE


    public SystemDopasowywania()
    {
        this.b=b;
    }  // ZMIENIONE

    //porownuje nieruchomosc i wymagania klienta, sprawdza ile pol sie zgadza
    public static int sprawdzDopasowanie (Rekord klient, Rekord nier)
    {


        int pasujace=0;
        if(nier instanceof Nieruchomosc)
        {
            String holder[];

            holder = klient.getCena().split("-");
            if(holder[1]==null) {
                if (klient.getCena().equals(nier.getCena()))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.getCena())) && (Integer.parseInt(nier.getCena()) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.getCzynsz().split("-");
            if(holder[1]==null) {
                if(klient.getCzynsz().equals(nier.getCzynsz()))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.getCzynsz())) && (Integer.parseInt(nier.getCzynsz()) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.getPowCalkowita().split("-");
            if(holder[1]==null) {
                if(klient.getPowCalkowita().equals(nier.getPowCalkowita()))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.getPowCalkowita())) && (Integer.parseInt(nier.getPowCalkowita()) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            if(klient.getDzielnica().equals(nier.getDzielnica()))
                pasujace++;
            if(klient.getOsiedle().equals(nier.getOsiedle()))
                pasujace++;
            if(klient.getTyp().equals(nier.getTyp()))
                pasujace++;
            if(klient.getPietroNaIle().equals(nier.getPietroNaIle()))
                pasujace++;
            holder = klient.getIloscPokoi().split("-");
            if(holder[1]==null) {
                if(klient.getIloscPokoi().equals(nier.getIloscPokoi()))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.getIloscPokoi())) && (Integer.parseInt(nier.getIloscPokoi()) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.getIloscLazienek().split("-");
            if(holder[1]==null) {
                if(klient.getIloscLazienek().equals(nier.getIloscLazienek()))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.getIloscLazienek())) && (Integer.parseInt(nier.getIloscLazienek()) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            holder = klient.getWysokoscCzynszu().split("-");
            if(holder[1]==null) {
                if(klient.getWysokoscCzynszu().equals(nier.getWysokoscCzynszu()))
                    pasujace++;
            } else {
                if ((Integer.parseInt(holder[0]) <= Integer.parseInt(nier.getWysokoscCzynszu())) && (Integer.parseInt(nier.getWysokoscCzynszu()) <= Integer.parseInt(holder[1])))
                    pasujace++;
            }
            if(klient.getBalkon().equals(nier.getBalkon()))
                pasujace++;
            if(klient.getOgrod().equals(nier.getOgrod()))
                pasujace++;
            if(klient.getMiejscaParkingoweNaziemne().equals(nier.getMiejscaParkingoweNaziemne()))
                pasujace++;
            if(klient.getMiejscaParkingowePodziemne().equals(nier.getMiejscaParkingowePodziemne()))
                pasujace++;
            if(klient.getPiwnica().equals(nier.getPiwnica()))
                pasujace++;
            if(klient.getWinda().equals(nier.getWinda()))
                pasujace++;
            if(klient.getOsiedleStrzezone().equals(nier.getOsiedleStrzezone()))
                pasujace++;
            if(klient.getRynekWtorny().equals(nier.getRynekWtorny()))
                pasujace++;
        }
        return pasujace;
    }

    /*wypisuje na ekran ID kazdego klienta, ktorego wymagania z podana
    dokladnoscia zgadzaja sie z opisem nieruchomosci*/
    public  void dopasujKlienta (Rekord nieruchomosc, int dokladnosc)
    {

        for(int i=0; i<b.getBaza().size(); ++i)
        {
            Rekord klient = b.getBaza().get(i);
            if(klient instanceof Klient)
            {
                int pasujace= SystemDopasowywania.sprawdzDopasowanie(klient, nieruchomosc);

                if(pasujace>=dokladnosc) //jesli elemntow spelniajacych wymagania jest dosc to wypisze na ekran
                    System.out.println(klient.ID + " pasujacych pol:" + pasujace);
            }
        }
    }

    //analogicznie do dopasujKlienta
    public  void dopasujNieruchomosc (Rekord klient, int dokladnosc)
    {

        for(int i=0; i<b.getBaza().size(); ++i)
        {
            Rekord nieruchomosc = b.getBaza().get(i);
            if(nieruchomosc instanceof Nieruchomosc)
            {
                int pasujace= SystemDopasowywania.sprawdzDopasowanie(klient, nieruchomosc);

                if(pasujace>=dokladnosc) //jesli elemntow spelniajacych wymagania jest dosc to wypisze na ekran
                    System.out.println(nieruchomosc.ID + " pasujacych pol:" + pasujace);
            }
        }
    }


}