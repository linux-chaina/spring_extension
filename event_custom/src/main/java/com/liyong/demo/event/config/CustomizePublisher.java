package com.liyong.demo.event.config;

import com.liyong.demo.common.utils.Utils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 16:09 </p>
 * <p> description  </p>
 **/
@Service
public class CustomizePublisher implements ApplicationEventPublisherAware, ApplicationContextAware {

    private ApplicationEventPublisher applicationEventPublisher;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
        Utils.printTrack("applicationEventPublisher is set : " + applicationEventPublisher);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 发送一条广播
     */
    public void publishEvent() {
        applicationEventPublisher.publishEvent(new CustomizeEvent(applicationContext));
    }
}
