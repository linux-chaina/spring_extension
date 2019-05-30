package com.liyong.demo.event.controller;

import com.liyong.demo.event.config.CustomizePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 16:17 </p>
 * <p> description  </p>
 **/
@RestController
public class CustomizePublishEventController {

    @Autowired
    private CustomizePublisher customizePublisher;

    @RequestMapping("/publish")
    public String publish() {

        customizePublisher.publishEvent();

        return "publish finish, "
                + new Date();
    }
}
