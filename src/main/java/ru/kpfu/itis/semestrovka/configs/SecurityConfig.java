package ru.kpfu.itis.semestrovka.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.kpfu.itis.semestrovka.security.AuthProviderImpl;

@Configuration
@EnableWebSecurity
@ComponentScan("ru.kpfu.itis.semestrovka.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private AuthProviderImpl authProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/signUp", "/signIn").anonymous()
                .antMatchers( "/items/new-item", "/items/{id}/new-comment", "/items/{id}/update","/items/{id}/delete","/items/{id}/comments/{commentId}/new-answer").authenticated()
                .and().csrf().disable()

                .formLogin()
                .loginPage("/signIn")
                .loginProcessingUrl("/auth/process")
                .usernameParameter("email")
                .failureUrl("/signIn?error=true")
                .and()
                .exceptionHandling()
                .accessDeniedPage("/profile")
                .and().logout();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authProvider);
    }

}
