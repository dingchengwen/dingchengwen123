package com.ln.service.impl;

import com.ln.entity.PlayerBean;
import com.ln.mapper.PlayerMapper;
import com.ln.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 时间： 2020/9/1 0001 9:46
 * 作者： 丁程文
 */
@Service
public class PlayerServiceImpl implements PlayerService {
    @Resource
    private PlayerMapper playerMapper;
    @Override
    public List<PlayerBean> getAll() {
        return playerMapper.getAll();
    }

    @Override
    public void addPlayer(PlayerBean playerBean) {
        playerMapper.addPlayer(playerBean);
    }

    @Override
    public void delPlayer(Long[] ids) {
        for (Long id : ids) {
            playerMapper.delPlayer(id);
        }
    }
}
