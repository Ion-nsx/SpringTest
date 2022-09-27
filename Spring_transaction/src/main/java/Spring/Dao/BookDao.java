package Spring.Dao;

public interface BookDao {

    //查询图书的价格
    Integer getPriceByBookId(Integer bookId);

    //更新图书库存
    Integer updateStock(Integer bookId);

    //更新用户余额
    Integer updateBalance(Integer userId,Integer price);


}
