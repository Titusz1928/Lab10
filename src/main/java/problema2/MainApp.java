package problema2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //BeanFactory factory=new ClassPathXmlApplicationContext("beans_lab1.xml");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans_lab1.xml");
        Autoturism a=(Autoturism) context.getBean("auto1");
        System.out.println(a);
        a=(Autoturism) context.getBean("auto2");
        System.out.println(a);

        Motocicleta m=(Motocicleta)context.getBean("motocicleta1");
        System.out.println(m);

        context.registerShutdownHook();
        context.close();

        context=new ClassPathXmlApplicationContext("beans_lab2.xml");
        Tir t=(Tir)context.getBean("tir");
        System.out.println(t);

    }
}
