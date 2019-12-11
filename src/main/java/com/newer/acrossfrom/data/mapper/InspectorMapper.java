package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Inspector;
import java.math.BigDecimal;
import java.util.List;

public interface InspectorMapper {
    int deleteByPrimaryKey(BigDecimal inspectorId);

    int insert(Inspector record);

    Inspector selectByPrimaryKey(BigDecimal inspectorId);

    List<Inspector> selectAll();

    int updateByPrimaryKey(Inspector record);
}