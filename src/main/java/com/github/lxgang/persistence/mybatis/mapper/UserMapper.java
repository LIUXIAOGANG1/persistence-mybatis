package com.github.lxgang.persistence.mybatis.mapper;

import java.util.List;

import com.github.lxgang.persistence.beans.User;

public interface UserMapper {
	public List<User> findOneByName(String name);
}
