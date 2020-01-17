/**
 * FileName: AyServiceImpl
 * Author:   dxk
 * Date:     2020/1/9 16:55
 * Description: 实现类
 */
package com.ay.service.impl;

import com.ay.dao.AyUserDao;
import com.ay.domain.AyUser;
import com.ay.service.AyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现类主要通过注入Dao接口，并实现findAll方法，在findAll方法中找到Dao的findAll方法
 */
@Service
public class AyServiceImpl implements AyUserService {

    @Autowired
    private AyUserDao ayUserDao;

    @Override
    public List<AyUser> findAll() {
        return ayUserDao.findAll();
    }
}
