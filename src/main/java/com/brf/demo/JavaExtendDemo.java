package com.brf.demo;

import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.util.LogUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by BRF on 2017-06-03.
 */

@Service("javaExtendDemo")
public class JavaExtendDemo implements CgformEnhanceJavaInter {
    @Override
    public void execute(String tableName, Map map) throws BusinessException {
        for (Object obj : map.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
