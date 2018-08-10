package com.example.springboot.service.impl;

import com.example.springboot.dao.UmconfigMapper;
import com.example.springboot.pojo.Umconfig;
import com.example.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 李超
 * @Description:
 * @Date: Created in 2018/8/10 16:42
 * @Version: 1.0
 * @Copyright: (c) 2018 广东轩辕网络科技股份有限公司
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    public UmconfigMapper umconfigMapper;

    @Override
    public List<Umconfig> list() {
        return umconfigMapper.selectAll();
    }
}
