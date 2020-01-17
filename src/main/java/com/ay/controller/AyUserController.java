/**
 * FileName: AyUserController
 * Author:   dxk
 * Date:     2020/1/9 17:02
 * Description: 注入服务层接口
 */
package com.ay.controller;

import com.ay.domain.AyUser;
import com.ay.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.management.modelmbean.ModelMBeanOperationInfo;
import java.util.List;

@Controller
@RequestMapping("/user")
/*sha a*/
public class AyUserController {
    @Resource
    private AyUserService ayUserService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("执行第一步");
        List<AyUser> ayUserList = ayUserService.findAll();
        for (AyUser ayUser:ayUserList){
            System.out.println("id"+ayUser.getId());
            System.out.println("name"+ayUser.getName());
        }
        model.addAttribute("list",ayUserList);
        return "hello";
    }
}
