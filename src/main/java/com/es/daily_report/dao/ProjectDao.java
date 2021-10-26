package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Project;
import com.es.daily_report.entities.Report;
import com.es.daily_report.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProjectDao extends ServiceImpl<ProjectMapper, Project> {

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
}
