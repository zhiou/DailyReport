package com.es.daily_report.mapstruct;

import com.es.daily_report.entities.Task;
import com.es.daily_report.vo.TaskVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TaskVoMapper {
    TaskVO taskToTaskVO(Task task);
}
