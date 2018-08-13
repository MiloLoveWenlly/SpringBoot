package com.example.springboot.service.impl;

import com.example.springboot.dao.DictMapper;
import com.example.springboot.pojo.Dict;
import com.example.springboot.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 李超
 * @Description:
 * @Date: Created in 2018/8/13 11:24
 * @Version: 1.0
 * @Copyright: (c) 2018 广东轩辕网络科技股份有限公司
 */
@Service
public class DictServiceImpl implements IDictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<Dict> list() {
        return dictMapper.selectAll();
    }
}
