package com.zyp.mapper;

import com.zyp.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();
    //添加一个用户
    public int add(User user);
    //删除一个用户
    public int delete(int id);
}
