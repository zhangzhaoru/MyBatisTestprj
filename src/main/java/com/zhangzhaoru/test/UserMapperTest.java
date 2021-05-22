package com.zhangzhaoru.test;

import com.zhangzhaoru.dao.UserMapper;
import com.zhangzhaoru.pojo.User;
import com.zhangzhaoru.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @BelongsProject: MyBatisTestprj
 * @BelongsPackage: com.zhangzhaoru.test
 * @Author: ZhangZhaoru
 * @Date: 2021/5/22 10:05 下午
 * @Description:
 */

public class UserMapperTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getAllUser();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
