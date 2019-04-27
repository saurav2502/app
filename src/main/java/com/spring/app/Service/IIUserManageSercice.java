package com.spring.app.Service;

import java.util.List;

import com.spring.app.vo.UserVO;


public interface IIUserManageSercice {
    List<UserVO> findAllUser();
    UserVO findUserById(UserVO userVo);
    void updateUser(UserVO userVO);
    void deleteUser();
    void addUser();
	UserVO findUserById(String userId);
}
