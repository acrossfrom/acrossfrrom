package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Solver;
import java.math.BigDecimal;
import java.util.List;

public interface SolverMapper {
    int deleteByPrimaryKey(BigDecimal solverId);

    int insert(Solver record);

    Solver selectByPrimaryKey(BigDecimal solverId);

    List<Solver> selectAll();

    int updateByPrimaryKey(Solver record);
}