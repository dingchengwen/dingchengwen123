package com.ln.service.impl;

import com.ln.entity.SchoolBean;
import com.ln.mapper.SchoolMapper;
import com.ln.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 时间： 2020/9/1 0001 10:19
 * 作者： 丁程文
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Resource
    private SchoolMapper schoolrMapper;
    @Override
    public List<SchoolBean> getSchool() {
        List<SchoolBean> slist=schoolrMapper.getSchool();
        return slist;
    }
}
