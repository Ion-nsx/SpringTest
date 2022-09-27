package Spring.Dao.Impl;

import Spring.Dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BookDaoImp implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql="select price from b_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class,bookId);
    }

    @Override
    public Integer updateStock(Integer bookId) {
        String sql="update b_book set stock = stock-1 where book_id = ?";
        return jdbcTemplate.update(sql,bookId);
    }

    @Override
    public Integer updateBalance(Integer userId, Integer price) {
        String sql="update b_user set balance = balance-? where user_id = ?";
        return jdbcTemplate.update(sql,price,userId);
    }
}
