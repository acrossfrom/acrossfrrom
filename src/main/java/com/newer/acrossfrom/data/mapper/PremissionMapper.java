package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Premission;
import java.math.BigDecimal;
import java.util.List;

public interface PremissionMapper {
    int deleteByPrimaryKey(BigDecimal rpId);

    int insert(Premission record);

    Premission selectByPrimaryKey(BigDecimal rpId);

    List<Premission> selectAll();

    int updateByPrimaryKey(Premission record);
}