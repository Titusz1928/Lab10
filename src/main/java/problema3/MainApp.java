package problema3;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans_lab3.xml");
        OperatiiBD operatiiBD =(OperatiiBD)context.getBean("operatiiJDBC");

        /*operatiiBD.insert("Mia", 11);
        operatiiBD.insert("Moni", 2);
        operatiiBD.insert("Oana", 15);
        System.out.println("- Afisarea persoanelor din BD:" );
        List<Persoana> persoane = operatiiBD.getListaPersoane();
        for (Persoana p : persoane) {
            System.out.println(p);
        }
        System.out.println("- Actualizarea varstei pentru persoana cu id-ul 3" );
        operatiiBD.update(3, 21);
        System.out.print("- Afisarea datelor persoanei cu id-ul 3: " );
        Persoana p = operatiiBD.getPersoana(3);
        System.out.println(p);*/

        int opt=0;
        Scanner sc=new Scanner(System.in);
        Scanner scl=new Scanner(System.in);
        do{
            System.out.println("0 = iesire" );
            System.out.println("1 = Adaugare in BD" );
            System.out.println("2 = Stergere" );
            System.out.println("3 = Afisare" );
            System.out.println("4 = nr masinilor cu o anumita marca" );
            System.out.println("5 = nr masinilor cu mai putin de 100k km" );
            System.out.println("6 = masini noi" );
            opt=sc.nextInt();
            switch(opt){
                case 0->{
                    System.out.println("iseire din program");
                }
                case 1->{
                    System.out.println("nr inmatriculare=");
                    String nr_inmat=scl.nextLine();
                    System.out.println("marca=");
                    String marca=sc.next();
                    System.out.println("anul fabricatiei=");
                    int an_fab=sc.nextInt();
                    System.out.println("culoarea=");
                    String culoare=sc.next();
                    System.out.println("numarul de kilometrii=");
                    int nr_km=sc.nextInt();
                    operatiiBD.insert(nr_inmat,marca,an_fab,culoare,nr_km);
                }
                case 2->{
                    System.out.println("stergere masina");
                    System.out.println("nr inmatriculare=");
                    String nr_inmat=scl.nextLine();
                    operatiiBD.delete(nr_inmat);
                }
                case 3->{
                    List<Masina> masini = operatiiBD.getListaMasini();
                    for (Masina m : masini) {
                        System.out.println(m);
                    }
                }
                case 4->{
                    System.out.println("marca=");
                    String marca=sc.next();
                    System.out.println(operatiiBD.getNrMarca(marca));
                }
                case 5->{
                    //System.out.println(nr km=");
                    //int val=sc.nextInt();
                    int val=100000;
                    System.out.println(operatiiBD.getNrSubValkm(val));
                }
                case 6->{
                    List<Masina> masini = operatiiBD.getListaMasini();
                    for (Masina m : masini) {
                        if(LocalDate.now().getYear()-m.getAn_fab()<5) {
                            System.out.println(m);
                        }
                    }
                }
                default->{
                    System.out.println("error");
                }
            }
        }while(opt!=0);


    }
}