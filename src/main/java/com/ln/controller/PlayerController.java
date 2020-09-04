package com.ln.controller;

import com.ln.entity.PlayerBean;
import com.ln.service.PlayerService;
import com.ln.utils.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 时间： 2020/9/1 0001 9:50
 * 作者： 丁程文
 */
@RestController
@RequestMapping("/PlayerController")
public class PlayerController {
    @Resource
    private PlayerService playerService;
    @RequestMapping("/getAll")
    public Object getAll(){
        List<PlayerBean> list = playerService.getAll();
        return list;
    }
    @RequestMapping("/addPlayer")
    public Result addPlayer(@RequestBody PlayerBean playerBean) {
        try {
            playerService.addPlayer(playerBean);
            return new Result(Result.RESULTTRUE, "保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Result.RESULTFALSE, "保存失败");
        }
    }
    @RequestMapping("/delPlayer")
    public Result delPlayer(@RequestBody Long[] ids) {
        try {
            playerService.delPlayer(ids);
            return new Result(Result.RESULTTRUE, "删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Result.RESULTFALSE, "删除失败");
        }
    }

}

