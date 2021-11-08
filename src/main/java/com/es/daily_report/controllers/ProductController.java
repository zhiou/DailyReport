package com.es.daily_report.controllers;

import com.es.daily_report.dao.ProductDao;
import com.es.daily_report.entities.Product;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ProductRemoveVO;
import com.es.daily_report.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/product", produces = "application/json;charset=utf-8")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @PostMapping
    @RequiresRoles("pmo")
    public Result<?> create(@RequestBody ProductVO productVO) {
        if (productDao.isNumberExisted(productVO.getNumber())) {
            return Result.failure(ErrorType.PRODUCT_EXISTED);
        }
        Product product = Product.builder()
                .number(productVO.getNumber())
                .name(productVO.getName())
                .inLine(productVO.getInLine())
                .build();
        productDao.save(product);
        return Result.success();
    }


    @PutMapping
    @RequiresRoles("pmo")
    public Result<?> update(@RequestBody ProductVO productVO) {
        Product product = productDao.queryByNumber(productVO.getNumber());
        if (productVO.getInLine() != null) {
            product.setInLine(productVO.getInLine());
        }
        if (productVO.getName() != null) {
            product.setName(productVO.getName());
        }
        productDao.updateById(product);
        return Result.success();
    }

    @GetMapping
    public Result<?> query() {
        return Result.success(productDao.list());
    }

    @GetMapping("/{number}")
    public Result<?> query(@PathVariable String number) {
        return Result.success(productDao.queryByNumber(number));
    }

    @DeleteMapping
    @RequiresRoles("pmo")
    public Result<?> remove(@RequestBody ProductRemoveVO productRemoveVO) {
        return Result.success(productDao.batchRemoveByNumber(productRemoveVO.getNumbers()));
    }
}
