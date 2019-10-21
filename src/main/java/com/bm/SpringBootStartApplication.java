package com.bm;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author dhy
 * @version 1.0
 * @ClassName: SpringBootStartApplication
 * @createTime: 2019/10/21 17:26
 * @since JDK 1.8
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(HelloWorld.class);
    }
}