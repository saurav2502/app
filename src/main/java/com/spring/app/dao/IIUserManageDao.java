package com.spring.app.dao;

import com.spring.app.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
@Service
public interface IIUserManageDao {
    List<UserVO> findAllUser();

    UserVO findUserById(UserVO uservo);

    void updateUser(UserVO userVO);

    void deleteUser(UserVO userVO);

    void createUser(UserVO userVO);

    UserVO findUserwithContact(UserVO vo);

    List<UserVO> findUserMap(List<String> idList);

    Map<String, String> getDemodata(String id);
}
