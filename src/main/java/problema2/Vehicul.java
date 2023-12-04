package problema2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

enum Tip{
    Autorurism,
    Motocicleta,
    Tir
}

@Component
public class Vehicul {

    @Value("Renault")
    private String Marca;

    @Value("0")
    private float pret;

    @Value("Tir")
    private String tip;
    public Vehicul() {}

    public Vehicul(String marca, float pret, String tip) {
        this.Marca = marca;
        this.pret = pret;
        this.tip=tip;
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "Marca='" + Marca + '\'' +
                ", pret=" + pret + ", tip="+tip+
                '}';
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
