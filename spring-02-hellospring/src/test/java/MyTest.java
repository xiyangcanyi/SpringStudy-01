import com.zyp.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象！
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在Spring中管理了，我们要使用，直接去里面取出来就可以
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
