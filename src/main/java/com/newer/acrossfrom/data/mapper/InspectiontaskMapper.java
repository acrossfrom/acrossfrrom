package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Inspectiontask;
import java.math.BigDecimal;
import java.util.List;

public interface InspectiontaskMapper {
    int deleteByPrimaryKey(BigDecimal inspectId);

    int insert(Inspectiontask record);

    Inspectiontask selectByPrimaryKey(BigDecimal inspectId);

    List<Inspectiontask> selectAll();

    int updateByPrimaryKey(Inspectiontask record);
}