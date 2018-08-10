package com.example.springboot.controller;

import com.example.springboot.pojo.Umconfig;
import com.example.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 李超
 * @Description:
 * @Date: Created in 2018/8/10 16:47
 * @Version: 1.0
 * @Copyright: (c) 2018 广东轩辕网络科技股份有限公司
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("list")
    public List<Umconfig> list(){
        return testService.list();
    }
}
