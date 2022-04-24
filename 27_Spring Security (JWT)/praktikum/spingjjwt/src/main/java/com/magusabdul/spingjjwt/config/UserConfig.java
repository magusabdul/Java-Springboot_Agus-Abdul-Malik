package com.magusabdul.spingjjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {
    // @Bean
    // public UserDetailsService users(){
    //     UserDetails admin = User.builder().username("admin").password("{noop}password").roles("ADMIN").build();
    //     UserDetails user = User.builder().username("user").password("{bcrypt}$2a$04$MzVXtd4o0y4DOlyHMMLMDeE4/eezrsT5Xad.2lmGr/NkCpwBgvn3e").roles("ADMIN").build();  // yawinpassword

    //     return new InMemoryUserDetailsManager(admin, user);
    // }
}
