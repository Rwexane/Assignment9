package TheatreTicketBookingSystem.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Hasan on 10/29/2017.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(AuthenticationManagerBuilder amb) throws Exception{
        //amb.inMemoryAuthentication().withUser("root").password("")
        //.roles("USER").and().withUser("help").password("please").roles("ADMIN");
    }

   /* @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }*/

    protected void configure(HttpSecurity httpSecurity) throws Exception{
        //httpSecurity.httpBasic().and().authorizeRequests().antMatchers("/transcriptreviewsystem/**")
        //.hasRole("USER").and().csrf().disable().headers().frameOptions().disable();
        httpSecurity.csrf().disable();
    }
}
