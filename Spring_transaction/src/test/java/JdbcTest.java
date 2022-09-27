import Spring.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//指定当前测试类在Spring的测试环境中执行，此时就可以通过注入的方式直接获取IOC容器中的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring测试环境的配置文件
@ContextConfiguration("classpath:Spring-jdbc.xml")
public class JdbcTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Test
    public void test(){
        //update同时通过不同的sql语句实现增加，删除，修改功能.
        String sql="insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"张三",456789,25,"女","123@gmail.com");
    }

    @Test
    public void testGetUserById(){
        String sql="select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);

    }



}
