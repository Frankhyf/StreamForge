package com.streamforge.mapper;

import com.streamforge.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectById(@Param("id") Long id);
    User selectByUsername(@Param("username") String username);
    List<User> selectAll();

    int insertUser(User user);
    int updateUser(User user);
    int deleteById(@Param("id") Long id);
}
