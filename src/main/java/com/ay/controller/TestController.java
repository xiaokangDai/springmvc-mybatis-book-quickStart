/**
 * FileName: TestController
 * Author:   dxk
 * Date:     2020/1/9 14:17
 * Description:
 */
package com.ay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/sayhello")
    public String testController(){
        return "hello";
    }
}
