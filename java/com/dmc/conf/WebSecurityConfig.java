/*
 * Copyright (c) 2016 xiaomaihd and/or its affiliates.All Rights Reserved.
 *            http://www.xiaomaihd.com
 */
package com.dmc.conf;

import com.dmc.jwt.JsonWebTokenSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends JsonWebTokenSecurityConfig {
    @Override
    protected void setupAuthorization(HttpSecurity http) throws Exception {
        http.authorizeRequests()

                // allow anonymous access to /user/login endpoint
                .antMatchers("/user/login").permitAll()
                .antMatchers("/swagger/**").permitAll()
                .antMatchers("/web/**").permitAll()
                .antMatchers("/").permitAll()


                // authenticate all other requests
                .anyRequest().authenticated();
    }
}
