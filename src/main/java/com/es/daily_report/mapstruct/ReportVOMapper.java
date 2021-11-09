package com.es.daily_report.mapstruct;

import com.es.daily_report.entities.Report;
import com.es.daily_report.enums.ReportStatus;
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
    ReportVO do2vo(Report report);

    Report vo2do(ReportVO report, String workCode, String authorName, String department, String departmentId);

    List<ReportVO> dos2vos(List<Report> reports);

    default ReportStatus from(Integer status) {
        return ReportStatus.values()[status];
    }

    default Integer from(ReportStatus status) {
        return status.getValue();
    }
}
