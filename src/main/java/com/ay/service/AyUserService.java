/**
 * FileName: AyUserService
 * Author:   dxk
 * Date:     2020/1/9 16:52
 * Description: 服务层接口，只有一个查询下所有用户的方法
 */
package com.ay.service;

import com.ay.domain.AyUser;

import java.util.List;

public interface AyUserService {
    public List<AyUser> findAll();
}
