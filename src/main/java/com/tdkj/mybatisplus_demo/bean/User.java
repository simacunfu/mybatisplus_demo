package com.tdkj.mybatisplus_demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//1231231231123123
@Data
@TableName("user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    Integer id;
    @TableField(value = "name")
    String name;
    @TableField(value = "age")
    Integer age;
    @TableField(value = "email")
    String email;


}
