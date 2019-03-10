package com.ssm.service;

import com.ssm.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IUser")
public interface IUserService {
    public List<User> getUser();
}
