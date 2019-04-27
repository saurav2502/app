package com.spring.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import com.spring.app.Service.IIUserManageSercice;
import com.spring.app.vo.UserVO;

@RestController
@RequestMapping("/")
@ComponentScan(value = "com.spring.app")
@Scope(value = "session")
public class IuserManageController {
    @Autowired
    private IIUserManageSercice iUserManageSercice;

    @GetMapping("user")
    public List<UserVO> findAllUser() {
        return iUserManageSercice.findAllUser();
    }
    @GetMapping("user/{userId}")
    public UserVO findUserById(@PathVariable String userId) {
    	UserVO userVo = new UserVO();
    	userVo.setUserId(userId);
		return iUserManageSercice.findUserById(userVo);
    	
    }

    @PutMapping("update")
    public void updateUser(@RequestBody UserVO userVO){
        iUserManageSercice.updateUser(userVO);
    }
}
