package com.liyong.demo.aware.config;

import com.liyong.demo.aware.utils.Utils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 15:34 </p>
 * <p> description  </p>
 **/
@Service
public class CustomizeBeanNameAware implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String beanName) {
        Utils.printTrack("beanName is set to " + beanName);
        this.beanName = beanName;
    }

    public String getBeanName() {
        return this.beanName;
    }
}
