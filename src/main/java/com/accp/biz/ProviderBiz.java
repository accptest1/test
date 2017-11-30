package com.accp.biz;

import com.accp.entity.Provider;

import java.util.List;

public interface ProviderBiz {
    List<Provider> listProvider();
    List<Provider> listProviderByName(String proName);
}
