import Spring.Calculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-aop.xml");
        Calculator bean = applicationContext.getBean(Calculator.class);
        bean.add(1,2);
    }
}
