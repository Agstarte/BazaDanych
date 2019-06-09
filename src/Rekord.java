public abstract class Rekord {
    protected String ID;
    protected String cena;
    protected String czynsz;
    protected String powCalkowita;
    protected String dzielnica;
    protected String osiedle;
    protected String typ;
    protected String pietroNaIle;
    protected String iloscPokoi;
    protected String iloscLazienek;
    protected String wysokoscCzynszu;
    protected String balkon;
    protected String ogrod;
    protected String miejscaParkingoweNaziemne;
    protected String miejscaParkingowePodziemne;
    protected String piwnica;
    protected String winda;
    protected String osiedleStrzezone;
    protected String rynekWtorny;
    protected String opis;
    protected String komentarz;


    public abstract void pokazSzczegoly();
    public abstract void edytuj ();
    public abstract void zapisz ();
    Rekord(String ID, String cena, String czynsz, String powCalkowita, String dzielnica, String osiedle, String typ, String pietroNaIle,
           String iloscPokoi, String iloscLazienek, String wysokoscCzynszu, String balkon, String ogrod, String miejscaParkingoweNaziemne,
           String miejscaParkingowePodziemne, String piwnica, String winda, String osiedleStrzezone, String rynekWtorny, String opis, String komentarz)
    {
        this.ID = ID;
        this.cena = cena;
        this.czynsz = czynsz;
        this.powCalkowita = powCalkowita;
        this.dzielnica = dzielnica;
        this.osiedle = osiedle;
        this.typ = typ;
        this.pietroNaIle = pietroNaIle;
        this.iloscPokoi = iloscPokoi;
        this.iloscLazienek = iloscLazienek;
        this.wysokoscCzynszu = wysokoscCzynszu;
        this.balkon = balkon;
        this.ogrod = ogrod;
        this.miejscaParkingoweNaziemne = miejscaParkingoweNaziemne;
        this.miejscaParkingowePodziemne = miejscaParkingowePodziemne;
        this.piwnica = piwnica;
        this.winda = winda;
        this.osiedleStrzezone = osiedleStrzezone;
        this.rynekWtorny = rynekWtorny;
        this.opis = opis;
        this.komentarz = komentarz;
    }

}
