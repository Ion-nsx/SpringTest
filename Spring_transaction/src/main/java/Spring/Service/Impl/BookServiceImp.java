package Spring.Service.Impl;

import Spring.Dao.BookDao;
import Spring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional(

    )
    public void byBook(Integer userId,Integer bookId) {
        //查询图书的价格
        Integer price=bookDao.getPriceByBookId(bookId);
        System.out.println();
        //更新图书的库存
        bookDao.updateStock(bookId);


        //更新用户的余额
        bookDao.updateBalance(userId,price);



    }
}
