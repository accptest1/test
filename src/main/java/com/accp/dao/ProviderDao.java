package com.accp.dao;

import com.accp.entity.Provider;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ProviderDao")
public interface ProviderDao {
    List<Provider> listProvider();
    List<Provider> listProviderByName(@Param("proName") String proName);
}
