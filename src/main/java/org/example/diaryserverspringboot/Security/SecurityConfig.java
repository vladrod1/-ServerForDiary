package org.example.diaryserverspringboot.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

//Класс конфигурации для spring security
@Component
@EnableWebSecurity
public class SecurityConfig{
    @Autowired
    DataSource dataSource;

    //Бин для присоеждинения к базе данных
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
        return manager;
    }
    //Бин для создания ограниченного доступа к ссылкам
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests(user -> user.requestMatchers(new AntPathRequestMatcher("/")).hasAnyRole("ADMIN")
                    .anyRequest().authenticated()).formLogin(withDefaults()).httpBasic(withDefaults());
        return httpSecurity.build();
    }

}
