package com.dmc.conf;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    /*
     * mybatis-plus中的分页查询功能，需要PaginationInnerInterceptor分页插件的支持，否则分页查询功能不能生效。
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    @ConditionalOnProperty(name = "PROFILE", havingValue = "dev", matchIfMissing = true)
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
}
