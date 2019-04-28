package com.spring.app.Service;

import com.spring.app.vo.OrderVO;

public interface IIOrderManageService {
    OrderVO findOrderByUserId(String userId);
}
