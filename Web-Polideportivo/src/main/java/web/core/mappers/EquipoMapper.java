package web.core.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.core.modelo.Equipo;

public class EquipoMapper implements RowMapper<Equipo>{

	@Override
	public Equipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Equipo e = new Equipo();
		e.setIdEquipo(rs.getInt("equ_id"));
		e.setNombreEquipo(rs.getNString("equ_nombre"));
		e.setCategoria(rs.getInt("equ_fk_categoria"));
		if(rs.getDate("equ_fecha_inicio") != null){
			e.setFechaInicio(rs.getDate("equ_fecha_inicio").toLocalDate());
		}
		if(rs.getDate("equ_fecha_fin") != null){
			e.setFechaFin(rs.getDate("equ_fecha_fin").toLocalDate());
		}
		return e;
	}

}
