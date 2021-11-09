package com.es.daily_report.mapstruct;

import com.es.daily_report.entities.Project;
import com.es.daily_report.enums.ProjectState;
import com.es.daily_report.vo.ProjectVO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectVOMapper {
    ProjectVO do2vo(Project task);

    Project vo2do(ProjectVO projectVO);

    List<ProjectVO> dos2vos(List<Project> projects);

    default ProjectState from(Integer state) {
        return ProjectState.values()[state];
    }

    default Integer from(ProjectState state) {
        return state.getValue();
    }
}
