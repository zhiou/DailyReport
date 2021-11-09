package com.es.daily_report.dao;

import com.es.daily_report.entities.Project;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
public interface ProjectDao extends IService<Project> {
  Boolean isNumberExisted(String number);
  Project queryByNumber(String number);
  String[] batchRemoveByNumber(String[] numbers);
  List<String> queryMemberNumber(String projectNumber);
}
