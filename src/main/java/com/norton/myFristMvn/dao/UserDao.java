package com.norton.myFristMvn.dao;

import com.norton.myFristMvn.bean.User;

public interface UserDao {
	 
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
     
     
}
