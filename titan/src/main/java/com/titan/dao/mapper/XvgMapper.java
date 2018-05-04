package com.titan.dao.mapper;

import com.titan.dao.bean.Xvg;
import com.titan.dao.bean.XvgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XvgMapper {
    int countByExample(XvgExample example);

    int deleteByExample(XvgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xvg record);

    int insertSelective(Xvg record);

    List<Xvg> selectByExample(XvgExample example);

    Xvg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xvg record, @Param("example") XvgExample example);

    int updateByExample(@Param("record") Xvg record, @Param("example") XvgExample example);

    int updateByPrimaryKeySelective(Xvg record);

    int updateByPrimaryKey(Xvg record);
}