package com.liyong.demo.event.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 16:08 </p>
 * <p> description  自定义的消息类型</p>
 **/
public class CustomizeEvent extends ApplicationContextEvent {
    /**
     * Create a new ContextStartedEvent.
     *
     * @param source the {@code ApplicationContext} that the event is raised for
     *               (must not be {@code null})
     */
    public CustomizeEvent(ApplicationContext source) {
        super(source);
    }
}
