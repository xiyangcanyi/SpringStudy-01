package com.zyp.mapper;

import com.zyp.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    //我们所有的操作，都是使用sqlSession来执行，在原来，现在都使用SqlSeesionTemplate；
//    private  SqlSessionTemplate sqlSession;
//    public void setSqlSession(SqlSessionTemplate sqlSession){
//        this.sqlSession=sqlSession;
//
//    }
    @Override
    public List<User> selectUser() {
        User user = new User(10, "小王", "234556");
        UserMapper mapper =getSqlSession().getMapper(UserMapper.class);
        mapper.add(user);
        mapper.delete(5);

        return mapper.selectUser();
    }

    @Override
    public int add(User user) {
        UserMapper mapper=getSqlSession().getMapper(UserMapper.class);
        return mapper.add(user);
    }

    @Override
    public int delete(int id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
