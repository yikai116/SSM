package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.Myservice;

/**
 * Created by p on 2017/10/3.
 */
@RestController
@RequestMapping("/")
@CrossOrigin
public class UserController {
    @Autowired
    Myservice myservice;

    @RequestMapping(value = "/aa", method = RequestMethod.GET)
    public User aa(){
        User a = new User();
        a.setEmail("xxx@qq.com");
        a.setAuthCode("12345678");
        a.setOther("87654321");
        myservice.insert(a);
        return a;
    }
}
