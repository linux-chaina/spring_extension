package com.liyong.demo.aware.config;

import com.liyong.demo.common.utils.Utils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 15:35 </p>
 * <p> description  </p>
 **/
@Service
public class CustomizeApplicationContextAware implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Utils.printTrack("applicationContext is set to " + applicationContext);
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }
}
