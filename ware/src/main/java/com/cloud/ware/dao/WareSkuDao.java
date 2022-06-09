package com.cloud.ware.dao;

import com.cloud.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-27 17:47:41
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
