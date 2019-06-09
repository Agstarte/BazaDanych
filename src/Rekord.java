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


    protected abstract void pokazSzczegoly();
    protected abstract void edytuj ();
    protected abstract void zapisz ();
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

    /*

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getCzynsz() {
        return czynsz;
    }

    public void setCzynsz(String czynsz) {
        this.czynsz = czynsz;
    }

    public String getPowCalkowita() {
        return powCalkowita;
    }

    public void setPowCalkowita(String powCalkowita) {
        this.powCalkowita = powCalkowita;
    }

    public String getDzielnica() {
        return dzielnica;
    }

    public void setDzielnica(String dzielnica) {
        this.dzielnica = dzielnica;
    }

    public String getOsiedle() {
        return osiedle;
    }

    public void setOsiedle(String osiedle) {
        this.osiedle = osiedle;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getPietroNaIle() {
        return pietroNaIle;
    }

    public void setPietroNaIle(String pietroNaIle) {
        this.pietroNaIle = pietroNaIle;
    }

    public String getIloscPokoi() {
        return iloscPokoi;
    }

    public void setIloscPokoi(String iloscPokoi) {
        this.iloscPokoi = iloscPokoi;
    }

    public String getIloscLazienek() {
        return iloscLazienek;
    }

    public void setIloscLazienek(String iloscLazienek) {
        this.iloscLazienek = iloscLazienek;
    }

    public String getWysokoscCzynszu() {
        return wysokoscCzynszu;
    }

    public void setWysokoscCzynszu(String wysokoscCzynszu) {
        this.wysokoscCzynszu = wysokoscCzynszu;
    }

    public String getBalkon() {
        return balkon;
    }

    public void setBalkon(String balkon) {
        this.balkon = balkon;
    }

    public String getOgrod() {
        return ogrod;
    }

    public void setOgrod(String ogrod) {
        this.ogrod = ogrod;
    }

    public String getMiejscaParkingoweNaziemne() {
        return miejscaParkingoweNaziemne;
    }

    public void setMiejscaParkingoweNaziemne(String miejscaParkingoweNaziemne) {
        this.miejscaParkingoweNaziemne = miejscaParkingoweNaziemne;
    }

    public String getMiejscaParkingowePodziemne() {
        return miejscaParkingowePodziemne;
    }

    public void setMiejscaParkingowePodziemne(String miejscaParkingowePodziemne) {
        this.miejscaParkingowePodziemne = miejscaParkingowePodziemne;
    }

    public String getPiwnica() {
        return piwnica;
    }

    public void setPiwnica(String piwnica) {
        this.piwnica = piwnica;
    }

    public String getWinda() {
        return winda;
    }

    public void setWinda(String winda) {
        this.winda = winda;
    }

    public String getOsiedleStrzezone() {
        return osiedleStrzezone;
    }

    public void setOsiedleStrzezone(String osiedleStrzezone) {
        this.osiedleStrzezone = osiedleStrzezone;
    }

    public String getRynekWtorny() {
        return rynekWtorny;
    }

    public void setRynekWtorny(String rynekWtorny) {
        this.rynekWtorny = rynekWtorny;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKomentarz() {
        return komentarz;
    }

    public void setKomentarz(String komentarz) {
        this.komentarz = this.komentarz + komentarz;
    }

    public void setKomentarz2 (String komentarz) {this.komentarz = komentarz;}
    */
}
