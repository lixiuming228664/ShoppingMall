package com.sdut.mapper;

import com.sdut.pojo.ProductImages;
import com.sdut.pojo.ProductImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductImagesMapper {
    int countByExample(ProductImagesExample example);

    int deleteByExample(ProductImagesExample example);

    int deleteByPrimaryKey(Integer productImagesId);

    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    List<ProductImages> selectByExample(ProductImagesExample example);

    ProductImages selectByPrimaryKey(Integer productImagesId);

    int updateByExampleSelective(@Param("record") ProductImages record, @Param("example") ProductImagesExample example);

    int updateByExample(@Param("record") ProductImages record, @Param("example") ProductImagesExample example);

    int updateByPrimaryKeySelective(ProductImages record);

    int updateByPrimaryKey(ProductImages record);
}