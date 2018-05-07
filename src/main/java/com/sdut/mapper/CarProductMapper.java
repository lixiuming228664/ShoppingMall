package com.sdut.mapper;

import com.sdut.pojo.CarProduct;
import com.sdut.pojo.CarProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarProductMapper {
    int countByExample(CarProductExample example);

    int deleteByExample(CarProductExample example);

    int deleteByPrimaryKey(Integer carProductId);

    int insert(CarProduct record);

    int insertSelective(CarProduct record);

    List<CarProduct> selectByExample(CarProductExample example);

    CarProduct selectByPrimaryKey(Integer carProductId);

    int updateByExampleSelective(@Param("record") CarProduct record, @Param("example") CarProductExample example);

    int updateByExample(@Param("record") CarProduct record, @Param("example") CarProductExample example);

    int updateByPrimaryKeySelective(CarProduct record);

    int updateByPrimaryKey(CarProduct record);
}