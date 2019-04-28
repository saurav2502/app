package com.spring.app.Service.Impl;

import com.spring.app.Service.IIOrderManageService;
import com.spring.app.dao.IIOrderManageDao;
import com.spring.app.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IOrderManageServiceImpl implements IIOrderManageService {

    @Autowired
    private IIOrderManageDao orderManageDao;

    @Override
    public OrderVO findOrderByUserId(String userId) {
        OrderVO orderVO = orderManageDao.findOrderById(userId);
        return orderVO;
    }
}
