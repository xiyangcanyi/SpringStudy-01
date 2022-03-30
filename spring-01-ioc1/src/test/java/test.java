import com.zyp.service.UserService;
import com.zyp.service.UserServiceImpl;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }
}
