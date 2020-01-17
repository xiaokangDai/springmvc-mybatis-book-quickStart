/**
 * FileName: SpringTest
 * Author:   dxk
 * Date:     2020/1/9 13:36
 * Description:
 */
package com.ay.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {

    @Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest  springTest= (SpringTest) applicationContext.getBean("springTest");
        springTest.sayhello();
    }

    public void sayhello(){
        System.out.println("springTest测试");
    }
}
