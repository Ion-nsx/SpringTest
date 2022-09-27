package Spring.Controller;

import Spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    /**
     * @Autowired:实现自动装配的注解
     * 1.能标识的位置:
     * a>标识在成员变量上，此时不需要设置成员变量的set方法
     * b>标识在set方法上
     * c>为当前成员变量赋值的有参构造上
     * 2.默认通过byType方式进行赋值
     */
    @Autowired
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }

}
