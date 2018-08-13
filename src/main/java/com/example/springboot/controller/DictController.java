package com.example.springboot.controller;

import com.example.springboot.pojo.Dict;
import com.example.springboot.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 李超
 * @Description:
 * @Date: Created in 2018/8/13 11:25
 * @Version: 1.0
 * @Copyright: (c) 2018 广东轩辕网络科技股份有限公司
 */
@RestController
@RequestMapping("dict")
public class DictController {

    @Autowired
    private IDictService dictService;

    @RequestMapping("list")
    public List<Dict> list(){
        return dictService.list();
    }
}
