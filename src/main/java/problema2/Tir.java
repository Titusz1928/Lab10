package problema2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tir extends Vehicul {
    @Value("5000")
    private int IncarcaturaMax;

    public Tir(){}

    public Tir(String marca, float pret, String tip, int incarcaturaMax) {
        super(marca, pret, tip);
        IncarcaturaMax = incarcaturaMax;
    }

    @Override
    public String toString() {
        return super.toString()+ "Tir{" +
                "IncarcaturaMax=" + IncarcaturaMax +
                '}';
    }

    public int getIncarcaturaMax() {
        return IncarcaturaMax;
    }

    public void setIncarcaturaMax(int incarcaturaMax) {
        IncarcaturaMax = incarcaturaMax;
    }

}
