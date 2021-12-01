package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.es.daily_report.entities.UserRole;
import org.apache.ibatis.annotations.*;

import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhiou
 * @since 2021-12-01
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

    @Select("select distinct name from role left join user_role ur on role.id = ur.role_id where ur.user_id = #{number}")
    Set<String> rolesByUserNumber(@Param("number") String number);

    @Select("select * from user_role ur left join role r on r.id = ur.role_id where ur.user_id = #{number} and r.name = #{role_name}")
    UserRole queryBy(@Param("number") String number, @Param("role_name") String roleName);
}
