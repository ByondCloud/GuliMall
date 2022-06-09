package com.cloud.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.common.utils.PageUtils;
import com.cloud.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author ByondCloud
 * @email 1095938907@qq.com
 * @date 2022-05-27 16:48:28
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

