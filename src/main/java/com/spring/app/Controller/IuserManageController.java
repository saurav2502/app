package com.spring.app.Controller;

import com.spring.app.Service.IIUserManageSercice;
import com.spring.app.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public void updateUser(@RequestBody UserVO userVO) {
        iUserManageSercice.updateUser(userVO);
    }

    @PutMapping("deleteUser")
    public void deleteUser(@RequestBody UserVO userVO) {
        iUserManageSercice.deleteUser(userVO);
    }

    @PostMapping("addUser")
    public void createUser(@RequestBody UserVO userVO) {
        iUserManageSercice.createUser(userVO);
    }

    @GetMapping("getuser/{id}/{contact}")
    public UserVO findUserwithContact(@PathVariable String id, @PathVariable String contact) {
        UserVO vo = new UserVO();
        vo.setUserId(id);
        vo.setUserContact(contact);
        return iUserManageSercice.findUserwithContact(vo);
    }

    @GetMapping("mapUser/{ids}")
    public List<UserVO> getUserMap(@PathVariable("ids") List<String> idList) {
        return iUserManageSercice.findUserMap(idList);
    }

    @GetMapping("demo/user/{id}")
    public Map<String, String> getDemodata(@PathVariable String id) {
        return iUserManageSercice.getDemodata(id);
    }
}
