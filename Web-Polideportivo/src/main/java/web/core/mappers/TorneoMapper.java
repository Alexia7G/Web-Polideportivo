package web.core.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import web.core.modelo.Torneo;

public class TorneoMapper implements RowMapper<Torneo>{

	@Override
	public Torneo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Torneo t = new Torneo();
		t.setIdTorneo(rs.getInt("tor_id"));
		t.setNombreT(rs.getNString("tor_nombre"));
		t.setIdCategoria(rs.getInt("tor_fk_categoria"));
		
		if(rs.getDate("tor_fecha_inicio") != null){
		t.setFechaInicio(rs.getDate("tor_fecha_inicio").toLocalDate());
		}
		if(rs.getDate("tor_fecha_fin") != null){
			t.setFechaFin(rs.getDate("tor_fecha_fin").toLocalDate());
		}
		
		t.setIdEstado(rs.getInt("tor_fk_estado"));
		t.setVer(rs.getShort("tor_ver"));
		t.setNombreEstado(rs.getString("est_nombre"));
		t.setNombreCategoria(rs.getString("cat_nombre"));
		return t;
	}

}
