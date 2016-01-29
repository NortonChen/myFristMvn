package com.norton.myFristMvn.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.norton.myFristMvn.bean.User;
import com.norton.myFristMvn.dao.UserDao;
import com.norton.myFristMvn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
     
    @Override
    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDao.insertUser(user);
    }

}
