package com.es.daily_report.mapstruct;

import com.es.daily_report.entities.Role;
import com.es.daily_report.vo.RoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleVOMapper {
    RoleVO do2vo(Role role);

    Role vo2do(RoleVO roleVO);

    List<RoleVO> dos2vos(List<Role> roles);
}
