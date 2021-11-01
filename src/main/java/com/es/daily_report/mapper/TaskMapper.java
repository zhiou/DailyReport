package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.es.daily_report.entities.Task;
import com.es.daily_report.vo.ExcelVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface TaskMapper extends BaseMapper<Task> {
    @Select("select in_line as product_line, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where t.project_id=#{projectNumber}\n" +
            "and r.on_day between #{from} and #{to};")
    List<ExcelVO> listByProject(String projectNumber, Date from, Date to);

    @Select("select in_line as product_line, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.work_code=#{workCode}\n" +
            "and r.on_day between #{from} and #{to};")
    List<ExcelVO> listByWorkCode(String workCode, Date from, Date to);

    @Select("select in_line as product_line, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.department_id=#{departmentId}\n" +
            "and r.on_day between #{from} and #{to};")
    List<ExcelVO> listByDepartment(String departmentId, Date from, Date to);
}
