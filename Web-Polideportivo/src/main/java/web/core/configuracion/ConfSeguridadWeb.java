package web.core.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import web.core.servicios.UsuarioService;

@Configuration
@EnableWebSecurity
public class ConfSeguridadWeb extends WebSecurityConfigurerAdapter {
	@Autowired
	private UsuarioService UsService;

	String[] resources = new String[] { "/include/**", "/css/**", "/icons/**", "/img/**", "/js/**", "/vendor/**" };

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(UsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(resources).permitAll()
        .regexMatchers("/admin/.*").hasRole("ADMIN")
        .anyRequest()
        .permitAll()
        .and()
        .formLogin()
        .loginPage("/login")
        .successForwardUrl("/admin/torneos")
		.defaultSuccessUrl("/admin/torneos", true)
		.permitAll()
		.failureUrl("/login?error=true")
		.usernameParameter("username")
		.passwordParameter("password")
		.and()
		.logout()
		.permitAll()
		.logoutSuccessUrl("/login?logout");
	}
}
