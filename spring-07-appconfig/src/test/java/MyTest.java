import com.zyp.config.ZypConfig;
import com.zyp.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfigContext获取容器，通过配置类的class对象加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ZypConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());

    }

}
