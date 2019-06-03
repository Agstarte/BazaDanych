public class Ekspozycja {
    public boolean east;
    public boolean west;
    public boolean north;
    public boolean south;

    public Ekspozycja(boolean e, boolean w, boolean n, boolean s)
    {
        this.east=e;
        this.west=w;
        this.north=n;
        this.south=s;
    }

    public void Wyswietl()
    {
        System.out.println("Ekspozycja:");
        System.out.println("wschod:" + east);
        System.out.println("zachod:" + west);
        System.out.println("polnoc:" + north);
        System.out.println("poludnie:" + south);
    }
}
