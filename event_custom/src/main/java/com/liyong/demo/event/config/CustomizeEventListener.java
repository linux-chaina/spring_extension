package com.liyong.demo.event.config;

import com.liyong.demo.common.utils.Utils;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 16:19 </p>
 * <p> description  自定义的系统广播监听器，只接受CustomizeEvent类型的消息</p>
 **/
@Service
public class CustomizeEventListener implements ApplicationListener<CustomizeEvent> {
    @Override
    public void onApplicationEvent(CustomizeEvent event) {
//为了便于了解调用栈，在日志中打印当前堆栈
        Utils.printTrack("onApplicationEvent : " + event);
    }
}
