package com.ay.dao;

import com.ay.domain.AyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 这是一个接口，提供了一个findAll方法用来查询所有的用户。1111
 */
@Repository
public interface AyUserDao {

    public List<AyUser> findAll();

}
