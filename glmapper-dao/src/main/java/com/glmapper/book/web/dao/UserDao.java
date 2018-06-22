package com.glmapper.book.web.dao;

import com.glmapper.book.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/4
 */
@Mapper
public interface UserDao {

    int insertUser(UserModel userModel);
}
