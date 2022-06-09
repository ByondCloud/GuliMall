package com.cloud.product.dao;

import com.cloud.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-26 17:45:43
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
