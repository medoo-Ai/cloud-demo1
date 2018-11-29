package cn.itcast.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @auther SyntacticSugar
 * @data 2018/11/28 0028下午 10:17
 */

public @Data class User {
    private Long id;

    private String userName; // 用户名

    private String password; // 密码

    private String name;// 姓名

    private Integer age;// 年龄

    private Integer sex;// 性别，1男性，2女性

    private Date birthday;// 出生日期

    private Date created;// 创建时间

    private Date updated;// 更新时间

    private String note;// 备注

}
