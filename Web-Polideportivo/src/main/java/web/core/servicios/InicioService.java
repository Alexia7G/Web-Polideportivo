package web.core.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import web.core.modelo.Usuario;
import web.core.repositorios.UsuarioRepo;

@Service
public class InicioService {
	@Autowired
	private UsuarioRepo usuarioRepo;

	@Autowired
	private Environment env;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public void initUsuarios() {
		Usuario usuario = null;

		try {
			usuarioRepo.findByNombre(env.getProperty("polideportivo.usuario.nombre"));
		} catch (Exception e) {
			usuario = new Usuario();
			usuario.setNombre(env.getProperty("polideportivo.usuario.nombre"));
			usuario.setPassword(passwordEncoder.encode(env.getProperty("polideportivo.usuario.pass")));
			usuario.setEstado(1);
			usuario.setGrupo(1);
			usuarioRepo.guardar(usuario);
		}
	}
}
