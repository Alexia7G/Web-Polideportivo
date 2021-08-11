package web.core.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.core.modelo.Estado;

public class EstadosMapper implements RowMapper<Estado>{

	@Override
	public Estado mapRow(ResultSet rs, int rowNum) throws SQLException {
		Estado e = new Estado();
		e.setIdEstado(rs.getInt("est_id"));
		e.setNombreEstado(rs.getString("est_nombre"));
		return e;
	}
}
