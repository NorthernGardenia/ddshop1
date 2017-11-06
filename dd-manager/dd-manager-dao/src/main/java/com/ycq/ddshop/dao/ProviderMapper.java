package com.ycq.ddshop.dao;

import com.ycq.ddshop.pojo.po.Provider;
import com.ycq.ddshop.pojo.po.ProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviderMapper {
    int countByExample(ProviderExample example);

    int deleteByExample(ProviderExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Provider record);

    int insertSelective(Provider record);

    List<Provider> selectByExample(ProviderExample example);

    Provider selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByExample(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKey(Provider record);
}