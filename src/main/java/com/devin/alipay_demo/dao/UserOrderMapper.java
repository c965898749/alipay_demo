package com.devin.alipay_demo.dao;

import com.devin.alipay_demo.entity.UserOrder;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UserOrderMapper extends Mapper<UserOrder>, MySqlMapper<UserOrder> {
}
