package com.newer.acrossfrom.view.control;

import com.newer.acrossfrom.data.bean.Consumer;
import com.newer.acrossfrom.service.service.ConsumerService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
/*跨域注解*/
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

   @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public Consumer login(Consumer consumer) {
        System.out.println("进入登陆方法");
        System.out.println(consumer.toString());
//		1.将用户输入的账号密码 封装在token中
        UsernamePasswordToken token = new UsernamePasswordToken(consumer.getUserCode(),consumer.getUserPassword());
//        2.获取Subject
        Subject subject = SecurityUtils.getSubject();
//        3.通过Subject 的login方法 完成登录
        try {
            subject.login(token);
            //到这里如果没有异常说明登录成功，
            return (Consumer) subject.getSession().getAttribute("user");
        } catch (Exception e) {
            //有异常说明登录失败，重定向到登录页面
            System.out.println(e.getMessage());
            return null;
        }
    }
}
