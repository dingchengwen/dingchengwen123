package com.ln.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 时间： 2020/9/1 0001 9:33
 * 作者： 丁程文
 */
@Data
public class PlayerBean implements Serializable{
    private Long id;
    private String name;
    private Integer age;
    private String birthday;
    private Long sid;
    private Long tid;
    private Integer cc;
    private String sname;
    private String tname;
    private String area;

}
