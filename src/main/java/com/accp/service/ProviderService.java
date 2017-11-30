package com.accp.service;

import com.accp.biz.ProviderBiz;
import com.accp.entity.Provider;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
@Controller("ProviderService")
public class ProviderService {

    @Resource(name = "ProviderBiz")
    private ProviderBiz providerBiz;

    public List<Provider> listProvider(){
        return providerBiz.listProvider();
    }
    public List<Provider> listProviderByName(String name){
        return  providerBiz.listProviderByName(name);
    }
}
