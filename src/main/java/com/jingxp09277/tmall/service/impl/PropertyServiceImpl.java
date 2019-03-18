package com.jingxp09277.tmall.service.impl;

import com.jingxp09277.tmall.mapper.PropertyMapper;
import com.jingxp09277.tmall.pojo.Property;
import com.jingxp09277.tmall.pojo.PropertyExample;
import com.jingxp09277.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public List list(int cid){
        PropertyExample example = new PropertyExample();
        example.createCriteria().andCidEqualTo(cid);
        return  propertyMapper.selectByExample(example);
    }

    @Override
    public void add(Property property) {
        propertyMapper.insert(property);
    }

    @Override
    public void delete(int id) {
        propertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Property get(int id) {
        return propertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Property property) {
        propertyMapper.updateByPrimaryKeySelective(property);
    }
}
