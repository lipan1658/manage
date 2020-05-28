package com.lp.framework.manage.service.impl;

import com.lp.framework.manage.mapper.UserMapper;
import com.lp.framework.manage.model.User;
import com.lp.framework.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User selectByUserCode(String userCode) {
        return userMapper.selectByUserCode(userCode);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectByPage(Map<String, Object> params) {
        return userMapper.selectByPage(params);
    }

    @Override
    public int updatePwdByPrimaryKey(User user) {
        return userMapper.updatePwdByPrimaryKey(user);
    }
}
