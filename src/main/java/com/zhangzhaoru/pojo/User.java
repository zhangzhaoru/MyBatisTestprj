package com.zhangzhaoru.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: MyBatisTestprj
 * @BelongsPackage: com.zhangzhaoru.pojo
 * @Author: ZhangZhaoru
 * @Date: 2021/5/22 9:34 下午
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String userName;
    private String password;
    private String address;
    private String phone;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
