package com.ln.service.impl;

import com.ln.entity.TeamBean;
import com.ln.mapper.TeamMapper;
import com.ln.service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 时间： 2020/9/1 0001 10:20
 * 作者： 丁程文
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Resource
    private TeamMapper teamMapper;

    @Override
    public List<TeamBean> getTeam() {
        List<TeamBean> tlist=teamMapper.getTeam();
        return tlist;
    }
}
