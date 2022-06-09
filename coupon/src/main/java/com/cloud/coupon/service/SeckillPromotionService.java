package com.cloud.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.common.utils.PageUtils;
import com.cloud.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-27 16:16:19
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

