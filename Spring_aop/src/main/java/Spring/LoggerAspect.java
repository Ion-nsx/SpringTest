package Spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Before:前置通知
 * 切入点表达式:设置在标识通知打的注解的value属性中
 * execution(* Spring.CalculatorImpl.*(..))
 * 第一个*表示任意的访问修饰符和返回值类型
 * 第二个*表示类中任意的方法
 * ..表示任意的参数列表
 */

/**
 * 获取连接点的信息:
 * 在通知方法的参数位置，设置JoinPoint类型的参数，就可以获取连接点对应方法信息
 */

@Component
@Aspect //将当前组件标记为切面
public class LoggerAspect {

    //重用切入点表达式
    //@Pointcut声明一个公共的切入点表达式
    @Pointcut("execution(* Spring.CalculatorImpl.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        //获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        //获取连接点对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知" + signature.getName()+"参数:" + Arrays.toString(args));
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("后置通知"+signature.getName());

    }



}
