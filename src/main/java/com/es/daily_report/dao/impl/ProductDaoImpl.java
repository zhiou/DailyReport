package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.es.daily_report.entities.Product;
import com.es.daily_report.mapper.ProductMapper;
import com.es.daily_report.dao.ProductDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
@Service
public class ProductDaoImpl extends ServiceImpl<ProductMapper, Product> implements ProductDao {
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
