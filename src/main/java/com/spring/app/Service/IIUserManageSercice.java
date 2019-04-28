package com.spring.app.Service;

import com.spring.app.vo.UserVO;

import java.util.List;
import java.util.Map;


public interface IIUserManageSercice {
    List<UserVO> findAllUser();
    UserVO findUserById(UserVO userVo);
    void updateUser(UserVO userVO);
    void deleteUser(UserVO userVO);
    void addUser();
	UserVO findUserById(String userId);

    void createUser(UserVO userVO);

    UserVO findUserwithContact(UserVO vo);

    List<UserVO> findUserMap(List<String> idList);

    Map<String, String> getDemodata(String id);
}
