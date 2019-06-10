public class Adres {

    protected String ulica;
    protected String kodPocztowy;
    protected String nrDomu;
    protected String nrMieszkania;

    public Adres (String ul, String kod, String nrD, String nrM)
    {
        ulica =ul;
        kodPocztowy=kod;
        nrDomu=nrD;
        nrMieszkania=nrM;
    }

    public void wyswietlAdres()
    {
        System.out.print(ulica + " ");
        if(nrMieszkania==null)
            System.out.println(nrDomu);
        else
            System.out.println(nrDomu + "/" + nrMieszkania);
        System.out.println(kodPocztowy);
    }




}