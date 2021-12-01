package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.dao.UserRoleDao;
import com.es.daily_report.entities.UserRole;
import com.es.daily_report.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-12-01
 */
@Service
public class UserRoleDaoImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleDao {
    public Set<String> rolesOfUser(String workCode) {
        return baseMapper.rolesByUserNumber(workCode);
    }

    public UserRole queryBy(String workCode, String roleName) {
        return baseMapper.queryBy(workCode, roleName);
    }
}
