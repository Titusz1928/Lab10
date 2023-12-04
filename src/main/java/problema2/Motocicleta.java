package problema2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motocicleta extends Vehicul  implements InitializingBean, DisposableBean {
    private int VitezaMax;


    public  Motocicleta(){}
    public Motocicleta(String marca, float pret, String tip, int vitezaMax) {
        super(marca, pret, tip);
        VitezaMax = vitezaMax;
    }

    @Override
    public String toString() {
        return super.toString()+ "Motocicleta{" +
                "VitezaMax=" + VitezaMax +
                '}';
    }

    public int getVitezaMax() {
        return VitezaMax;
    }

    public void setVitezaMax(int vitezaMax) {
        VitezaMax = vitezaMax;
    }

    public void init(){
        System.out.println("init()");
    }
    public void disp(){
        System.out.println("disp()");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - afterPropertiesSet()");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean - destroy()");
    }


}
