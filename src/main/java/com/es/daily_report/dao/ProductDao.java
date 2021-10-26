package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Product;
import com.es.daily_report.entities.Project;
import com.es.daily_report.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDao extends ServiceImpl<ProductMapper, Product> {

    public Boolean isNumberExisted(String number) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();
        wrapper.eq("number", number);
        wrapper.last("LIMIT 1");
        return getOne(wrapper) != null;
    }

    public Product queryByNumber(String number) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();
        wrapper.eq("number", number);
        wrapper.last("LIMIT 1");
        return getOne(wrapper);
    }

    public String[] batchRemoveByNumber(String[] numbers) {
        List<String> removedNumbers = new ArrayList<>();
        for (String number: numbers) {
            QueryWrapper<Product> wrapper = new QueryWrapper<>();
            wrapper.eq("number", number);
            if (remove(wrapper)) {
                removedNumbers.add(number);
            }
        }
        return removedNumbers.toArray(new String[0]);
    }
}
