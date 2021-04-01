package com.yarukoto.main.dao.gen;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yarukoto.main.dto.gen.TYarukoto;
import com.yarukoto.main.dto.gen.TYarukotoExample;

public interface TYarukotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int countByExample(TYarukotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int deleteByExample(TYarukotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int insert(TYarukoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int insertSelective(TYarukoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    List<TYarukoto> selectByExample(TYarukotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    TYarukoto selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int updateByExampleSelective(@Param("record") TYarukoto record, @Param("example") TYarukotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int updateByExample(@Param("record") TYarukoto record, @Param("example") TYarukotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int updateByPrimaryKeySelective(TYarukoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_yarukoto
     *
     * @mbggenerated Thu Apr 01 21:36:53 GMT+09:00 2021
     */
    int updateByPrimaryKey(TYarukoto record);
}