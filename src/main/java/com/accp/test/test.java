package com.accp.test;

import com.accp.entity.Provider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.accp.service.ProviderService;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("SpringConfig.xml");
        ProviderService bean = ac.getBean(ProviderService.class);
        for (Provider p:bean.listProvider()) {
            System.out.println(p);
        }
        System.out.println();
        for (Provider p:bean.listProviderByName("北")) {
            System.out.println(p);
        }
    }
}
