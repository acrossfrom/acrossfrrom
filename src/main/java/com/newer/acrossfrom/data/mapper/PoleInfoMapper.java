package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.PoleInfo;
import java.math.BigDecimal;
import java.util.List;

public interface PoleInfoMapper {
    int deleteByPrimaryKey(BigDecimal poleId);

    int insert(PoleInfo record);

    PoleInfo selectByPrimaryKey(BigDecimal poleId);

    List<PoleInfo> selectAll();

    int updateByPrimaryKey(PoleInfo record);
}