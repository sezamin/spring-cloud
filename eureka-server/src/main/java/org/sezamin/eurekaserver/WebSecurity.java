package org.sezamin.eurekaserver;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class WebSecurity {
    @Bean
    public SecurityFilterChain SecurityFilterChain(HttpSecurity http)
        throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and().formLogin();

        return http.build();
    }
}