package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Function;
import java.math.BigDecimal;
import java.util.List;

public interface FunctionMapper {
    int deleteByPrimaryKey(BigDecimal functionId);

    int insert(Function record);

    Function selectByPrimaryKey(BigDecimal functionId);

    List<Function> selectAll();

    int updateByPrimaryKey(Function record);
}