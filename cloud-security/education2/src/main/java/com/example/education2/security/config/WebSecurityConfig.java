package com.example.education2.security.config;

import com.example.education2.filter.AuthenticationFilter;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * 资源服务配置
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public AuthenticationFilter authenticationFilter(){
        return new AuthenticationFilter();
    }
    /**
     * 请求配置
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class)
                .antMatcher("/**").authorizeRequests()
                .anyRequest().authenticated();
    }


}
