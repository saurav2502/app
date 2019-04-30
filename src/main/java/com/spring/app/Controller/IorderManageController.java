package com.spring.app.Controller;

import com.spring.app.Service.IIOrderManageService;
import com.spring.app.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IorderManageController {

    @Autowired
    private IIOrderManageService orderManageService;

    @GetMapping("order/{id}")
    public OrderVO findOrderByUserId(@PathVariable("id") String userId) {
        return orderManageService.findOrderByUserId(userId);
    }
}
