public class Adres {

    private String ulica;
    private String kodPocztowy;
    private String nrDomu;
    private String nrMieszkania;

    public Adres (String ul, String kod, String nrD, String nrM)
    {
        ulica =ul;
        kodPocztowy=kod;
        nrDomu=nrD;
        nrMieszkania=nrM;
    }

    public void getAdres ()
    {
        System.out.print(ulica + " ");
        if(nrMieszkania==null)
            System.out.println(nrDomu);
        else
            System.out.println(nrDomu + "/" + nrMieszkania);
        System.out.println(kodPocztowy);
    }

    public String getUlica() {
        return ulica;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public String getNrMieszkania() {
        return nrMieszkania;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public void setNrMieszkania(String nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }



}