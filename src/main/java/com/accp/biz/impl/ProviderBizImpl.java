package com.accp.biz.impl;

import com.accp.biz.ProviderBiz;
import com.accp.dao.ProviderDao;
import com.accp.entity.Provider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("ProviderBiz")
public class ProviderBizImpl implements ProviderBiz {

    @Resource(name = "ProviderDao")
    private ProviderDao providerDao;

    public List<Provider> listProvider() {
        return providerDao.listProvider();
    }

    public List<Provider> listProviderByName(String proName) {
        return providerDao.listProviderByName(proName);
    }
}
