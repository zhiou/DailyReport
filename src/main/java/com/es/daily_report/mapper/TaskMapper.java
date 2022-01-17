package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.es.daily_report.entities.Task;
import com.es.daily_report.vo.DepartmentVO;
import com.es.daily_report.vo.ExcelVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface TaskMapper extends BaseMapper<Task> {
    @Select("select distinct department, department_id from report where report.deleted = 0")
    List<DepartmentVO> listAllDepartments();

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.deleted = 0 and t.deleted = 0 \n" +
            "and r.on_day >= #{from} and r.on_day < #{to}\n" +
            "order by r.on_day desc;")
    List<ExcelVO> listAll(@Param("from") Date from, @Param("to") Date to);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where t.project_id=#{projectNumber} and r.deleted = 0 and t.deleted = 0 \n" +
            "order by r.on_day desc;")
    List<ExcelVO> listByProject(@Param("projectNumber") String projectNumber);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where t.project_id in (select number from project where parent_number = #{projectNumber}) and r.deleted = 0 and t.deleted = 0 \n" +
            "order by r.on_day desc;")
    List<ExcelVO> listByParentProject(@Param("projectNumber") String projectNumber);


    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where t.product_id=#{productNumber} and r.deleted = 0 and t.deleted = 0 \n" +
            "order by r.on_day desc;")
    List<ExcelVO> listByProduct(@Param("productNumber") String productNumber);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.work_code=#{workCode}  and r.deleted = 0 and t.deleted = 0 \n" +
            "and r.on_day >= #{from} and r.on_day < #{to}\n" +
            "order by r.on_day desc;")
    List<ExcelVO> listByWorkCode(@Param("workCode") String workCode, @Param("from") Date from, @Param("to") Date to);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.department_id=#{departmentId} and r.deleted = 0 and t.deleted = 0 \n" +
            "and r.on_day >= #{from} and r.on_day < #{to}\n" +
            "order by r.on_day desc;")
    List<ExcelVO> listByDepartment(@Param("departmentId") String departmentId, @Param("from") Date from, @Param("to") Date to);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where t.project_id=#{projectNumber}  and r.deleted = 0 and t.deleted = 0 \n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageByProject(Page<?> page, @Param("projectNumber") String projectNumber);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.work_code=#{workCode} and r.deleted = 0 and t.deleted = 0 \n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageByWorkCode(Page<?> page, @Param("workCode") String workCode);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.department_id=#{departmentId} and r.deleted = 0 and t.deleted = 0 \n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageByDepartment(Page<?> page, @Param("departmentId") String departmentId);

    @Select("select in_line as product_line, prod.number as product_number, prod.name as product_name, r.department as department, r.work_code as work_code, r.author_name as staff_name," +
            "t.cost as task_cost, proj.number as project_number, proj.name as project_name, r.on_day as report_date, t.name as task_name, t.details as task_detail, r.committed as commit_date\n" +
            "from task t \n" +
            "left join report r on t.in_report=r.id\n" +
            "left join product prod on t.product_id=prod.number\n" +
            "left join project proj on t.project_id=proj.number\n" +
            "where r.deleted = 0 and t.deleted = 0 \n" +
            "order by r.on_day desc")
    IPage<ExcelVO> pageAll(Page<?> page);
}
