package com.spring.app.Service.Impl;

import com.spring.app.Service.IIUserManageSercice;
import com.spring.app.dao.IIUserManageDao;
import com.spring.app.vo.UserVO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserManageSerciceImpl implements IIUserManageSercice {

	@Autowired
	private IIUserManageDao userDao;

	@Override
	public UserVO findUserById(String userId) {
		UserVO uservo = new UserVO();
		uservo.setUserId(userId);
		return userDao.findUserById(uservo);
	}

	@Override
	public void updateUser(UserVO userVO) {
		userDao.updateUser(userVO);
	}

	@Override
	public void deleteUser() {

	}

	@Override
	public void addUser() {

	}

	@Override
	public UserVO findUserById(UserVO userVo) {
		// TODO Auto-generated method stub
		return userDao.findUserById(userVo);
	}

	@Override
	public List<UserVO> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}
}
