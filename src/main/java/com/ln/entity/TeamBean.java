package com.ln.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 时间： 2020/9/1 0001 9:34
 * 作者： 丁程文
 */
@Data
public class TeamBean implements Serializable{
    private Long tid;
    private String tname;
    private String area;

}
