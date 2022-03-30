import com.zyp.pojo.Peoper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Peoper people = context.getBean("people", Peoper.class);
        //System.out.println(people);
        people.getDog().shout();
        people.getCat().shout();


    }

}
