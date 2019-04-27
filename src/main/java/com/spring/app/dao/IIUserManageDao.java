package com.spring.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.spring.app.vo.UserVO;

@Mapper
@Service
public interface IIUserManageDao {
	List<UserVO> findAllUser();

	UserVO findUserById(UserVO uservo);

    void updateUser(UserVO userVO);

	void deleteUser(UserVO userVO);

	void createUser(UserVO userVO);
}
