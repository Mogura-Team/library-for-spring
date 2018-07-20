package com.web.library.dao.generate.mapper;

import com.web.library.dao.generate.entity.TUserStatus;
import com.web.library.dao.generate.entity.TUserStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    long countByExample(TUserStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int deleteByExample(TUserStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int insert(TUserStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int insertSelective(TUserStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    List<TUserStatus> selectByExample(TUserStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    TUserStatus selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int updateByExampleSelective(@Param("record") TUserStatus record, @Param("example") TUserStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int updateByExample(@Param("record") TUserStatus record, @Param("example") TUserStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int updateByPrimaryKeySelective(TUserStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_status
     *
     * @mbg.generated Fri Jul 20 18:07:24 JST 2018
     */
    int updateByPrimaryKey(TUserStatus record);
}