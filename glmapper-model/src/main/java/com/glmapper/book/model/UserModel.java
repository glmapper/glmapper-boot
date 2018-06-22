package com.glmapper.book.model;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/4
 */
public class UserModel {

    private Integer id;
    private String  userName;
    private String  nickName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
