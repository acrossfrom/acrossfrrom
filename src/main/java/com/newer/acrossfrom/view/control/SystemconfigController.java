package com.newer.acrossfrom.view.control;

import com.newer.acrossfrom.data.bean.Systemconfig;
import com.newer.acrossfrom.service.service.SystemconfigService;
import com.newer.acrossfrom.view.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class SystemconfigController {

    @Resource
    SystemconfigService systemconfigService;

    //分页查询
   @GetMapping(value = "queryBlogPages.do")
    @ResponseBody
    public Map<String, Object> queryBlogPages(PageBean page){
        System.out.println("启动控制器分页：queryBlogPages");
        System.out.println("添加");
        PageBean<Systemconfig> pageBeans =
                this.systemconfigService.queryReturnBlogPage(page.getPageNo(),
                        page.getPageSize());
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        paramsMap.put("list", pageBeans);
        System.out.println("查询"+pageBeans);
        return paramsMap;
    }

    //删除
    @GetMapping("deleteById.do")
    @ResponseBody
    public int deleteById(Integer sysId){
        System.out.println("启动删除：deleteById");
       int i= systemconfigService.deleteByPrimaryKey(sysId);
        System.out.println("getUserAccount发送GET请求，传递的ID是："+sysId);
        System.out.println("结果"+sysId);
       return i;
    }
}
