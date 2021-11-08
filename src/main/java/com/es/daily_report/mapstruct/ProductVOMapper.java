package com.es.daily_report.mapstruct;

import com.es.daily_report.entities.Product;
import com.es.daily_report.vo.ProductVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductVOMapper {
    ProductVO do2vo(Product task);

    Product vo2do(ProductVO projectVO);

    List<ProductVO> dos2vos(List<Product> projects);
}
