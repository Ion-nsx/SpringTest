import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class DITest {

    @Test
    public void test(){
        //获取IOC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-ioc.xml");
        //获取Bean
        Student student = applicationContext.getBean("student",Student.class);
        System.out.println(student);
    }



}
