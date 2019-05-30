package com.demo.liyong.inject.config;

import com.demo.liyong.inject.controller.ReadController;
import com.demo.liyong.inject.controller.WriteController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-30 01:12 </p>
 * <p> description  使用dependsOn来确保加载顺序</p>
 **/
/*@Configuration*/
public class WriteBean {

    @Bean(value = "writeController")
    @DependsOn("readController")
    public WriteController getWriteController() {
        System.out.println("------------write-------------");
        WriteController controller = new WriteController();
        return controller;
    }

    @Bean(value = "readController")
    public ReadController getReadController() {
        System.out.println("------------read--------------");
        ReadController controller = new ReadController();
        return controller;
    }


}
