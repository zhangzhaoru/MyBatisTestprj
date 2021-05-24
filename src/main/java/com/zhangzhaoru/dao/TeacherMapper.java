package com.zhangzhaoru.dao;

import com.zhangzhaoru.pojo.Teacher;

import java.util.HashMap;

/**
 * @BelongsProject: MyBatisTestprj
 * @BelongsPackage: com.zhangzhaoru.dao
 * @Author: ZhangZhaoru
 * @Date: 2021/5/23 1:22 下午
 * @Description:
 */
public interface TeacherMapper {
    Teacher getTeacherById(int id);
}
