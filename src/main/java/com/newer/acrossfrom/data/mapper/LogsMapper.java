package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Logs;
import java.math.BigDecimal;
import java.util.List;

public interface LogsMapper {
    int deleteByPrimaryKey(BigDecimal logsId);

    int insert(Logs record);

    Logs selectByPrimaryKey(BigDecimal logsId);

    List<Logs> selectAll();

    int updateByPrimaryKey(Logs record);
}