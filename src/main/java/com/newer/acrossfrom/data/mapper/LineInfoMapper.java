package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.LineInfo;
import java.math.BigDecimal;
import java.util.List;

public interface LineInfoMapper {
    int deleteByPrimaryKey(BigDecimal lineId);

    int insert(LineInfo record);

    LineInfo selectByPrimaryKey(BigDecimal lineId);

    List<LineInfo> selectAll();

    int updateByPrimaryKey(LineInfo record);
}