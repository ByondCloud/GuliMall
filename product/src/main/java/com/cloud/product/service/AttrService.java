package com.cloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.common.utils.PageUtils;
import com.cloud.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-26 17:45:43
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

