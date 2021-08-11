package web.core.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import web.core.mappers.UsuarioMapper;
import web.core.modelo.Usuario;

@Repository
public class UsuarioRepo implements IUsuarioRepo {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public boolean guardar(Usuario object) {
		try {
			String sql = String.format(
					"insert into usuarios (usu_nombre, usu_contrasena, usu_estado, usu_fk_grupo) values ('%s', '%s', '%d', '%d')",
					object.getNombre(), object.getPassword(), object.getEstado(), object.getGrupo());
			jdbc.execute(sql);
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
	}

	@Override
	public List<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByNombre(String nombre) {
		Object[] params = new Object[] {nombre};
		return jdbc.queryForObject("select * from usuarios where usu_nombre = ?", new UsuarioMapper(), params);
	}

}