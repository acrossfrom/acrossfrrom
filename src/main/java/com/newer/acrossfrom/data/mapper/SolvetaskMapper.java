package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Solvetask;
import java.math.BigDecimal;
import java.util.List;

public interface SolvetaskMapper {
    int deleteByPrimaryKey(BigDecimal stId);

    int insert(Solvetask record);

    Solvetask selectByPrimaryKey(BigDecimal stId);

    List<Solvetask> selectAll();

    int updateByPrimaryKey(Solvetask record);
}