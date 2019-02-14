package com.myblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myblog.domain.User;

@Mapper
public interface UserMapper {
	List<User> findAllUser();
}
