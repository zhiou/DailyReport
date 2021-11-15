package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.es.daily_report.entities.Task;
import com.es.daily_report.vo.ExcelVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface TaskMapper extends BaseMapper<Task> {
    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where t.project_id=#{projectNumber}\n" +
            "and r.on_day between #{from} and #{to} " +
            "order by r.on_day desc;")
    List<ExcelVO> listByProject(String projectNumber, Date from, Date to);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.work_code=#{workCode}\n" +
            "and r.on_day between #{from} and #{to} " +
            "order by r.on_day desc;")
    List<ExcelVO> listByWorkCode(String workCode, Date from, Date to);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.department_id=#{departmentId}\n" +
            "and r.on_day between #{from} and #{to}" +
            "order by r.on_day desc;")
    List<ExcelVO> listByDepartment(String departmentId, Date from, Date to);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where t.project_id=#{projectNumber}\n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageByProject(Page<?> page, String projectNumber);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.work_code=#{workCode}\n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageByWorkCode(Page<?> page, String workCode);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.department_id=#{departmentId}\n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageByDepartment(Page<?> page, String departmentId);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageAll(Page<?> page);
}
