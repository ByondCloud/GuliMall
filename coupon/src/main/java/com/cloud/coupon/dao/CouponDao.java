package com.cloud.coupon.dao;

import com.cloud.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-27 16:16:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
