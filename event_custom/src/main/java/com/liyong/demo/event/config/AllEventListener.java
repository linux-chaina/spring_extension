package com.liyong.demo.event.config;

import com.liyong.demo.common.utils.Utils;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 16:18 </p>
 * <p> description  </p>
 **/
@Service
public class AllEventListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
//为了便于了解调用栈，在日志中打印当前堆栈
        Utils.printTrack("onApplicationEvent : " + event);
    }
}
