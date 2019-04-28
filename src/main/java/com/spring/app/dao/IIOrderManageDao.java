package com.spring.app.dao;

import com.spring.app.vo.OrderVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper
public interface IIOrderManageDao {
    OrderVO findOrderById (String userId);
}
