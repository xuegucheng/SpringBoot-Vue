package com.example.controller;

import com.example.service.UserService;
import com.example.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 * UserController
 *
 * @author XueGuCheng
 * @create 2020-12-07 21:51
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Integer delete(Integer userId) {
        System.out.println(userId);
        int result = userService.delete(userId);
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(User user) {
        int result = userService.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(User user) {
        return userService.insertUser(user);
    }

    @RequestMapping("/ListUser")
    @ResponseBody
    public List<User> ListUser() {
        return userService.ListUser();
    }

    @RequestMapping("/ListByName")
    @ResponseBody
    public List<User> ListUserByName(String userName) {
        return userService.findUserByName(userName);
    }

    /**
     * 分页
     * @return
     */
    @RequestMapping(value="/page")
    @ResponseBody
    public List<User> page(Integer page){
        int pageNow = page == null ? 1 : page;
        int pageSize = 5;
        int startRows = pageSize*(pageNow-1);
        List<User> list = userService.queryPage(startRows);
        return list;
    }

    /**
     * rows
     * @return
     */
    @RequestMapping(value="/rows")
    @ResponseBody
    public int rows(){
        return userService.getRowCount();
    }

}
