package com.aopdemo.web;

import com.aopdemo.pojo.User;
import com.aopdemo.result.ResultBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * 
* @Title: UserRestController
* @Description:用户控制层
* @author liuziyang
* @date 2022/10/13
 */
@RestController
@RequestMapping(value = "/api")
public class UserRestController {


    @GetMapping("/user")
    public ResultBody findByUser(User  user) {
        System.out.println("用户查询接口请求的参数:"+user);
        ResultBody resultBody = new ResultBody();
        List<User> userList =new ArrayList<>();
        User user2=new User();
        user2.setId(1L);
        user2.setName("liuziyang");
        user2.setAge(18);
        userList.add(user2);
        resultBody.setCode("0");
        resultBody.setResult(userList.toString());
        System.out.println("用户查询接口响应的参数:"+resultBody);
        return resultBody;
    }
}
