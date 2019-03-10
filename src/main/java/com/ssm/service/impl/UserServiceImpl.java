package com.ssm.service.impl;

import com.ssm.dao.IUserDao;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IUser")
public class UserServiceImpl implements IUserService {

    /*调用dao层*/
    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> getUser() {
        return iUserDao.getAllUser();
    }
}
