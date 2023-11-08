//package com.in.action.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class ProjectConfig extends WebSecurityConfigurerAdapter {
//
////    @Bean
////    public UserDetailsService userDetailsService() {
////        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        UserDetails userDetails = User.withUsername("john")
////                .password("123456")
////                .authorities("read")
////                .build();
////        manager.createUser(userDetails);
////
////        return manager;
////    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return NoOpPasswordEncoder.getInstance();
////    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.httpBasic();
////        http.authorizeRequests().anyRequest().permitAll();  // 所有请求都需要身份验证
////    }
////
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        UserDetails user = User.withUsername("tom")
////                .password("123456")
////                .authorities("read")
////                .build();
////        manager.createUser(user);
////        auth.userDetailsService(manager).passwordEncoder(NoOpPasswordEncoder.getInstance());
////    }
//
////
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
////                .withUser("tom")
////                .password("123456")
////                .authorities("read")
////                .and()
////                .passwordEncoder(NoOpPasswordEncoder.getInstance());
////    }
//
//    /*-------------注册AuthenticationProvider的新实现--------------*/
//    @Autowired
//    private CustomAuthenticationProvider authenticationProvider;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenticationProvider);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic();
//        http.authorizeRequests().anyRequest().authenticated();
//    }
//}
