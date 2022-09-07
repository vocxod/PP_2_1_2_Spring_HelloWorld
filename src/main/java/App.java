
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == bean2);
        assert (bean == bean2);

        Cat cBean = (Cat) applicationContext.getBean("cat");
        Cat cBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cBean == cBean2);

    }
}