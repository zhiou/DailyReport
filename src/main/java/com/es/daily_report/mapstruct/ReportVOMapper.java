package com.es.daily_report.mapstruct;

import com.es.daily_report.entities.Report;
import com.es.daily_report.vo.ReportVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReportVOMapper {
    ReportVO do2Vo(Report report);

    Report vo2do(ReportVO report, String workCode, String authorName, String department, String departmentId);

    List<ReportVO> dos2Vos(List<Report> reports);
}
