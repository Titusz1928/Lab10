package problema2;

public class Autoturism extends Vehicul{
    private float VolumPortbagaj;
    private int CatCantareste;

    public Autoturism() {}

    public Autoturism(String marca, float pret,String tip, float volumPortbagaj, int catCantareste) {
        super(marca, pret,tip);
        VolumPortbagaj = volumPortbagaj;
        CatCantareste = catCantareste;
    }

    @Override
    public String toString() {
        return super.toString() +
                "VolumPortbagaj=" + VolumPortbagaj +
                ", CatCantareste=" + CatCantareste +
                '}';
    }

    public float getVolumPortbagaj() {
        return VolumPortbagaj;
    }

    public void setVolumPortbagaj(float volumPortbagaj) {
        VolumPortbagaj = volumPortbagaj;
    }

    public int getCatCantareste() {
        return CatCantareste;
    }

    public void setCatCantareste(int catCantareste) {
        CatCantareste = catCantareste;
    }
}
