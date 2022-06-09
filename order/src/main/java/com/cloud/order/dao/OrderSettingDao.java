package com.cloud.order.dao;

import com.cloud.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-27 17:34:27
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
