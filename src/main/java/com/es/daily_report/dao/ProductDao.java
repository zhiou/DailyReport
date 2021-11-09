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
    public Boolean isNumberExisted(String number);

    public Product queryByNumber(String number);

    public String[] batchRemoveByNumber(String[] numbers);
}
