package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.dao.ProjectDao;
import com.es.daily_report.entities.Project;
import com.es.daily_report.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
@Service
public class ProjectDaoImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectDao {
 public Boolean isNumberExisted(String number) {
        QueryWrapper<Project> wrapper = new QueryWrapper<>();
        wrapper.eq("number", number);
        wrapper.last("LIMIT 1");
        return getOne(wrapper) != null;
    }

    public Project queryByNumber(String number) {
            QueryWrapper<Project> wrapper = new QueryWrapper<>();
            wrapper.eq("number", number);
            wrapper.last("LIMIT 1");
            return getOne(wrapper);
    }

    public List<Project> queryRoot() {
        QueryWrapper<Project> wrapper = new QueryWrapper<>();
        wrapper.isNull("parent_number");
        return list(wrapper);
    }

    public List<Project> queryByParentNumber(String number) {
        QueryWrapper<Project> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_number", number);
        return list(wrapper);
    }

    public String[] batchRemoveByNumber(String[] numbers) {
        List<String> removedNumbers = new ArrayList<>();
        for (String number: numbers) {
            QueryWrapper<Project> wrapper = new QueryWrapper<>();
            wrapper.eq("number", number);
            if (remove(wrapper)) {
                removedNumbers.add(number);
            }
        }
        return removedNumbers.toArray(new String[0]);
    }

    public List<Project> queryByManagerNumber(String workCode) {
        QueryWrapper<Project> wrapper = new QueryWrapper<>();
        wrapper.eq("manager_number", workCode);
        return list(wrapper);
    }

    @Override
    public Boolean beingPm(String workCode) {
        return queryByManagerNumber(workCode)
                .stream()
                .map(Project::getManagerNumber)
                .collect(Collectors.toList())
                .contains(workCode);
    }

    public List<String> queryMemberNumber(String projectNumber) {
        return baseMapper.queryMembers(projectNumber);
    }
}
