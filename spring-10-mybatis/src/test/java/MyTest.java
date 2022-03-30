import com.zyp.dao.UserMapper;
import com.zyp.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void testSelect() throws IOException{
//        SqlSessionFactoryBuilder sqlSession = new SqlSessionFactoryBuilder();

//
//        try {
//            String resources="mybatis-config.xml";
//            InputStream in= Resources.getResourceAsStream(resources);
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            List<User> userList = mapper.selectUser();
//            for (User user : userList) {
//                System.out.println(user);
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }



    }
}
