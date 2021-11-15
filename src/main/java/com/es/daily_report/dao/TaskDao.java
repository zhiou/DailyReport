package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.es.daily_report.entities.Task;
import com.baomidou.mybatisplus.extension.service.IService;
import com.es.daily_report.vo.ExcelVO;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
public interface TaskDao extends IService<Task> {
    void removeTasksOfReport(Long reportId);

    List<ExcelVO> queryByCondition(Integer type, String condition, Date from, Date to);

    IPage<ExcelVO> pageByCondition(Page<ExcelVO> page, Integer type, String condition);
}
