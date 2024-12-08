package com.streamforge.service.impl;

import com.streamforge.entity.User;
import com.streamforge.mapper.UserMapper;
import com.streamforge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //标记为业务逻辑层的bean
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper; // 依赖注入，IoC容器管理UserMapper的实例

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public void createUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectAll();
    }
}
