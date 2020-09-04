package com.ln.service;

import com.ln.entity.PlayerBean;

import java.util.List;

/**
 * 时间： 2020/9/1 0001 9:46
 * 作者： 丁程文
 */
public interface PlayerService {
    List<PlayerBean> getAll();
    void addPlayer(PlayerBean playerBean);

    void delPlayer(Long[] ids);
}
