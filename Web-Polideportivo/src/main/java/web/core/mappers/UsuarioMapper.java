package web.core.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.core.modelo.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario u = new Usuario();
		u.setIdUsuario(rs.getInt("usu_id"));
		u.setNombre(rs.getString("usu_nombre"));
		u.setPassword(rs.getString("usu_contrasena"));
		u.setEstado(rs.getInt("usu_estado"));
		u.setGrupo(rs.getInt("usu_fk_grupo"));
		return u;
	}
}
