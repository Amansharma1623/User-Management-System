package com.Assignment.User.management.System;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanBeg {
        @Bean
        public List<UserManage> getUsers(){
            return new ArrayList<>();
        }
  }
