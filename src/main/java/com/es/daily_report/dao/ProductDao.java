package com.es.daily_report.dao;

import com.es.daily_report.entities.Product;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
public interface ProductDao extends IService<Product> {
    Boolean isNumberExisted(String number);

    Product queryByNumber(String number);

    String[] batchRemoveByNumber(String[] numbers);
}
