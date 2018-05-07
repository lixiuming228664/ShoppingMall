package com.sdut.mapper;

import com.sdut.pojo.ProductParam;
import com.sdut.pojo.ProductParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductParamMapper {
    int countByExample(ProductParamExample example);

    int deleteByExample(ProductParamExample example);

    int deleteByPrimaryKey(Integer productParamId);

    int insert(ProductParam record);

    int insertSelective(ProductParam record);

    List<ProductParam> selectByExample(ProductParamExample example);

    ProductParam selectByPrimaryKey(Integer productParamId);

    int updateByExampleSelective(@Param("record") ProductParam record, @Param("example") ProductParamExample example);

    int updateByExample(@Param("record") ProductParam record, @Param("example") ProductParamExample example);

    int updateByPrimaryKeySelective(ProductParam record);

    int updateByPrimaryKey(ProductParam record);
}