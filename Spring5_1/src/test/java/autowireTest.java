import controller.UserController;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireTest {
    /**
     *自动装配:
     * 根据指定策略,在IOC容器中匹配某个bean，自动为bean中的类类型的属性或接口类型的属性赋值
     *
     * 策略:
     * (优先)byType:根据要赋值的属性的类型，在IOC容器中匹配某个bean，为属性赋值
     * 当使用byType实现自动装配时，IOC容器中有且只有一个类型疲累的bean能够为属性赋值
     * byName:将要赋值的属性的属性名作为bean的id在IOC容器中匹配某个bean，为属性赋值
     * 当类型匹配到的bean有多个时，此时可以使用byName实现自动装配
     */

    @Test
    public void testAutoWire(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-autowire.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.saveUser();

    }
}
