package web.core.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import web.core.mappers.TorneoMapper;
import web.core.modelo.Equipo;
import web.core.modelo.Torneo;

@Repository
public class TorneoRepo implements ITorneoRepo {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Torneo> findAll(Pageable pageable) {
		return jdbc.query("SELECT tor_id, tor_nombre, tor_fk_categoria, tor_fecha_inicio, tor_fecha_fin, tor_fk_estado, tor_ver, est_nombre, cat_nombre FROM torneos t JOIN estados e ON t.tor_fk_estado = e.est_id JOIN categorias c ON t.tor_fk_categoria = c.cat_id", new TorneoMapper());
	}

	@Override
	public Torneo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean guardar(Torneo object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean guardar(Torneo t, List<Equipo> e) {
		String sql1 = String.format(
				"insert into torneos (tor_nombre, tor_fk_categoria, tor_fecha_inicio, tor_fecha_fin) values ("
						+ "'%s','%d','%tF','%tF'" + " )",
				t.getNombreT(), t.getIdCategoria(), t.getFechaInicio(), t.getFechaFin());
		jdbc.execute(sql1);

		for (Equipo equipo : e) {
			String sql2 = String.format("insert into equipos (equ_nombre, equ_fk_categoria, equ_fecha_inicio) values ("
					+ "'%s','%d','%tF')", equipo.getNombreEquipo(), t.getIdCategoria(), t.getFechaInicio());
			jdbc.execute(sql2);
		}
		return true;
	}
}
