package web.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import web.core.servicios.InicioService;

@SpringBootApplication
public class WebPolideportivoApplication implements CommandLineRunner{
	@Autowired
	private InicioService inicioServ;
	
	public static void main(String[] args) {
		SpringApplication.run(WebPolideportivoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		inicioServ.initUsuarios();
	}

}
