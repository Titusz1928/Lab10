package problema3;

public class masina {
    private String nr_inmatriculare, marca,culoare;
    private int an_fab,nr_km;


    public masina(){}
    public masina(String nr_inmatriculare, String marca, String culoare, int an_fab, int nr_km) {
        this.nr_inmatriculare = nr_inmatriculare;
        this.marca = marca;
        this.culoare = culoare;
        this.an_fab = an_fab;
        this.nr_km = nr_km;
    }

    @Override
    public String toString() {
        return "masina{" +
                "nr_inmatriculare='" + nr_inmatriculare + '\'' +
                ", marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                ", an_fab=" + an_fab +
                ", nr_km=" + nr_km +
                '}';
    }

    public String getNr_inmatriculare() {
        return nr_inmatriculare;
    }

    public void setNr_inmatriculare(String nr_inmatriculare) {
        this.nr_inmatriculare = nr_inmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAn_fab() {
        return an_fab;
    }

    public void setAn_fab(int an_fab) {
        this.an_fab = an_fab;
    }

    public int getNr_km() {
        return nr_km;
    }

    public void setNr_km(int nr_km) {
        this.nr_km = nr_km;
    }
}
