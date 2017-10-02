package service.impl;

import dao.UserMapper;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by p on 2017/10/3.
 */
@Service
public class MyserviceImpl implements service.Myservice{
    @Autowired
    UserMapper userMapper;

    public void insert(User user){
        user.setEmail("xxxx@qq.com");
        userMapper.insert(user);
        System.out.println(user);
    }
}
