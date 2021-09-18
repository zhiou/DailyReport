package com.es.daily_report.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Product;
import com.es.daily_report.mapper.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductDao extends ServiceImpl<ProductMapper, Product> {
}
