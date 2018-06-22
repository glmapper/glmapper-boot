package com.glmapper.book.web.controller;

import com.glmapper.book.service.UserService;
import com.glmapper.book.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/4
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private Logger      logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 这里的需要返回数据给前端，格式为application/json
     * @param user
     * @param view
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", produces = { "application/json;charset=UTF-8" })
    public ModelAndView addUser(UserModel user, ModelAndView view) {
        user.setUserName("卫恒");
        user.setNickName("卫恒");
        userService.addUserModel(user);
        view.addObject("hello", "Hello FreeMarker");
        view.setViewName("/login");
        return view;
    }

    /**
     * 如果要直接返回字符串，这里类型需要修改成application/html
     * @return
     */
    @RequestMapping(value = "/test", produces = { "application/html;charset=UTF-8" })
    public String test(Map<String, Object> map) {
        map.put("hello", "Hello FreeMarker");
        return "/login";
    }
}
