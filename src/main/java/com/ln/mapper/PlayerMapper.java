package com.ln.mapper;

import com.ln.entity.PlayerBean;

import java.util.List;

/**
 * 时间： 2020/9/1 0001 9:44
 * 作者： 丁程文
 */
public interface PlayerMapper {
    List<PlayerBean> getAll();
    void addPlayer(PlayerBean playerBean);
    void delPlayer(Long id);

}
