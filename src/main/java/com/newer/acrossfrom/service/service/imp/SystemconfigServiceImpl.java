package com.newer.acrossfrom.service.service.imp;

import com.newer.acrossfrom.data.bean.Systemconfig;
import com.newer.acrossfrom.data.mapper.SystemconfigMapper;
import com.newer.acrossfrom.service.service.SystemconfigService;
import com.newer.acrossfrom.view.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SystemconfigServiceImpl implements SystemconfigService {

    @Resource
    SystemconfigMapper systemconfigMapper;

    @Override
    public PageBean<Systemconfig> queryReturnBlogPage(int pageNo, int pageSize) {
        System.out.println("业务层实现分页：queryReturnBlogPage");
        PageBean<Systemconfig> pageBean = new PageBean<Systemconfig>();
        try{
            Map<String, Object> parms = new HashMap<String, Object>();
            int start=(pageNo-1)*pageSize+1;
            int end =pageNo*pageSize;

            parms.put("startIndex",start);
            parms.put("endIndex",end);

            List<Systemconfig> blogs = systemconfigMapper.selectByPage(parms);
            int totalCount = systemconfigMapper.getTotalCount();

            pageBean.setData(blogs);
            pageBean.setTotalRecords(totalCount);
            pageBean.setPageNo(pageNo);
            pageBean.setPageSize(pageSize);
            System.out.println("业务层返回的分页结果："+pageBean.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageBean;
    }

    @Override
    public int deleteByPrimaryKey(Integer sysId) {
        return systemconfigMapper.deleteByPrimaryKey(sysId);
    }

    @Override
    public int insert(Systemconfig record) {
        return 0;
    }
}
