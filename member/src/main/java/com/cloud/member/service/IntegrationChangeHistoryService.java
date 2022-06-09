package com.cloud.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.common.utils.PageUtils;
import com.cloud.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-27 16:48:28
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

