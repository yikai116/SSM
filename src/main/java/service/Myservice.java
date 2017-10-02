package service;

import dao.UserMapper;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by p on 2017/10/3.
 */
public interface Myservice {
    void insert(User user);
}
