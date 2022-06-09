package com.cloud.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.common.utils.PageUtils;
import com.cloud.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-27 16:16:19
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

