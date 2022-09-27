import Spring.Controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocAnnotation {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController controller = applicationContext.getBean(UserController.class);
        /*
        System.out.println(controller);
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService);
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao);*/
        controller.saveUser();


    }
}
