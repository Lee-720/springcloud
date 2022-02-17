package com.eturial.esale.server.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("class")
public class ProductClass {

    @TableField("id")
    private int classId;

    @TableField("name")
    private String className;
}
