package com.ln.controller;

import com.ln.entity.TeamBean;
import com.ln.service.TeamService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 时间： 2020/9/1 0001 10:21
 * 作者： 丁程文
 */
@RestController
@RequestMapping("/TeamController")
public class TeamController {
    @Resource
    private TeamService teamService;
    @RequestMapping("/getTeam")
    public Object getTeam(){
        List<TeamBean> tlist=teamService.getTeam();
        return tlist;
    }

}
