package web.core.beans;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import web.core.modelo.Conexion;

@Component
public class CreandoConexion {
	@Bean(name = "beanConexion")
	public Conexion getConexion() {
		Conexion con = new Conexion();
		con.setDb("mysql");
		con.setUrl("localhost");
		return con;
	}
	
	@Bean(name= "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/polideportivo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("wb.35531204");
		return dataSource;
	}
}
