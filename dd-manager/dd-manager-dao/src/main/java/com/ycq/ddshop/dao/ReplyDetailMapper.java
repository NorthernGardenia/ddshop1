package com.ycq.ddshop.dao;

import com.ycq.ddshop.pojo.po.ReplyDetail;
import com.ycq.ddshop.pojo.po.ReplyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyDetailMapper {
    int countByExample(ReplyDetailExample example);

    int deleteByExample(ReplyDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReplyDetail record);

    int insertSelective(ReplyDetail record);

    List<ReplyDetail> selectByExample(ReplyDetailExample example);

    ReplyDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReplyDetail record, @Param("example") ReplyDetailExample example);

    int updateByExample(@Param("record") ReplyDetail record, @Param("example") ReplyDetailExample example);

    int updateByPrimaryKeySelective(ReplyDetail record);

    int updateByPrimaryKey(ReplyDetail record);
}