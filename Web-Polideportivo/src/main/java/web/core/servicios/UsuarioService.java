package web.core.servicios;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import web.core.modelo.Grupo;
import web.core.modelo.Usuario;
import web.core.repositorios.GrupoRepo;
import web.core.repositorios.UsuarioRepo;

@Service
public class UsuarioService implements UserDetailsService {
	@Autowired
	private UsuarioRepo usuarioRepo;
	
	@Autowired
	private GrupoRepo grupoRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario us = usuarioRepo.findByNombre(username);
		Grupo gr = grupoRepo.findById(Integer.valueOf(us.getGrupo()));
		
		GrantedAuthority grantedAut = new SimpleGrantedAuthority("ROLE_" + gr.getNombre().toUpperCase());
		return new User(us.getNombre(), us.getPassword(), Arrays.asList(grantedAut));
	}
	
	
}
