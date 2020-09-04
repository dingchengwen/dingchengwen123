package com.ln.controller;

import com.ln.entity.SchoolBean;
import com.ln.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 时间： 2020/9/1 0001 10:02
 * 作者： 丁程文
 */
@RestController
@RequestMapping("/SchoolController")
public class SchoolController {
    @Resource
    private SchoolService schoolService;
    @RequestMapping("/getSchool")
    public Object getSchool(){
        List<SchoolBean> slist=schoolService.getSchool();
        return slist;
    }


}
