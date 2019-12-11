package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Systemconfig;
import java.util.List;
import java.util.Map;

public interface SystemconfigMapper {
    int deleteByPrimaryKey(Integer sysId);

    int insert(Systemconfig record);

    Systemconfig selectByPrimaryKey(Integer sysId);

    List<Systemconfig> selectAll();

    int updateByPrimaryKey(Systemconfig record);


    //查询记录总数
     int getTotalCount();

    //根据页数计算当前页的全部记录
    //MyBatis为传递多个参数，必须使用HashMap
    //selectByPage(int pageNo, int pageSize, CustomerDTO dto)
     List<Systemconfig> selectByPage(Map<String, Object> param);

}