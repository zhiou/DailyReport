package com.es.daily_report.mapstruct;

import com.es.daily_report.entities.Task;
import com.es.daily_report.vo.TaskVO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskVOMapper {
    TaskVO do2vo(Task task);

    @Mapping(target="inReport", source="reportId")
    Task vo2do(TaskVO taskVO, Long reportId);
}
