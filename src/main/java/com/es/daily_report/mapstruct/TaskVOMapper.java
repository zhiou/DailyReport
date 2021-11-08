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
    TaskVO do2Vo(Task task);

    Task vo2Do(TaskVO taskVO);

    @Mapping(target="in_report",source="reportId")
    List<Task> vos2dos(List<TaskVO> vos, Long reportId);
}
