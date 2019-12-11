package com.newer.acrossfrom.service.service;

import com.newer.acrossfrom.data.bean.Systemconfig;
import com.newer.acrossfrom.view.util.PageBean;

public interface SystemconfigService {
    //分页查询
    PageBean<Systemconfig> queryReturnBlogPage(int pageNo, int pageSize);
    //删除
    int deleteByPrimaryKey(Integer sysId);
    //添加
    int insert(Systemconfig record);
}
