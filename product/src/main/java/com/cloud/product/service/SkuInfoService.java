package com.cloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.common.utils.PageUtils;
import com.cloud.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-26 17:45:43
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

