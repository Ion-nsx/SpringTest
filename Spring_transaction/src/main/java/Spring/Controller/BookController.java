package Spring.Controller;


import Spring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void byBook(Integer userId,Integer bookId){
        bookService.byBook(userId,bookId);

    }
}
