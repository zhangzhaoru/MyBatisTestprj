package com.zhangzhaoru.dao;

import com.zhangzhaoru.pojo.User;

import java.util.List;

/**
 * @BelongsProject: MyBatisTestprj
 * @BelongsPackage: com.zhangzhaoru.dao
 * @Author: ZhangZhaoru
 * @Date: 2021/5/22 9:40 下午
 * @Description:
 */

public interface UserMapper {

    public List<User> getAllUser();

}
