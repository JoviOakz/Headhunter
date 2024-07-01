package org.joao.headhunter.config;

import org.joao.headhunter.impl.DatabaseCreateUser;
import org.joao.headhunter.services.CreateUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DependenciesConfiguration {

    @Bean
    @Scope("singleton")
    public CreateUserService createUserService() {
        return new DatabaseCreateUser();
    }
}
