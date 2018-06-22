package com.glmapper.book.service.impl;

import com.glmapper.book.web.dao.UserDao;
import com.glmapper.book.model.UserModel;
import com.glmapper.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/4
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int addUserModel(UserModel userModel) {
        return userDao.insertUser(userModel);
    }
}
