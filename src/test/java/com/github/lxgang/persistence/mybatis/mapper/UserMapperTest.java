package com.github.lxgang.persistence.mybatis.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.lxgang.persistence.beans.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class UserMapperTest {
	
	@Resource
	private UserMapper userMapper;
	
    @Test
	public void findOneByName(){
		List<User> users = userMapper.findOneByName("Test");

		assertNotNull(users);
	}
}
