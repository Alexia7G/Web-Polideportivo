package web.core.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.core.modelo.Grupo;

public class GrupoMapper implements RowMapper<Grupo>{

	@Override
	public Grupo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Grupo g = new Grupo();
		g.setIdGrupo(rs.getInt("gru_id"));
		g.setNombre(rs.getString("gru_nombre"));
		return g;
	}

}
