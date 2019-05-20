package com.liyong.demo.custom_environ.config;

import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-20 15:00 </p>
 * <p> description  </p>
 **/
public class CustomApplicationContext extends AnnotationConfigServletWebServerApplicationContext {

    protected void initPropertySources() {
        super.initPropertySources();
        getEnvironment().setRequiredProperties("MYSQL_HOST");
    }
}
