package com.cloud.product.dao;

import com.cloud.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-26 17:45:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
