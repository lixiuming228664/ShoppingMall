package com.sdut.mapper;

import com.sdut.pojo.UserPath;
import com.sdut.pojo.UserPathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPathMapper {
    int countByExample(UserPathExample example);

    int deleteByExample(UserPathExample example);

    int deleteByPrimaryKey(Integer userPathId);

    int insert(UserPath record);

    int insertSelective(UserPath record);

    List<UserPath> selectByExample(UserPathExample example);

    UserPath selectByPrimaryKey(Integer userPathId);

    int updateByExampleSelective(@Param("record") UserPath record, @Param("example") UserPathExample example);

    int updateByExample(@Param("record") UserPath record, @Param("example") UserPathExample example);

    int updateByPrimaryKeySelective(UserPath record);

    int updateByPrimaryKey(UserPath record);
}