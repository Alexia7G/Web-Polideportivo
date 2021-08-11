package web.core.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import web.core.mappers.EquipoMapper;
import web.core.modelo.Equipo;

@Repository
public class EquipoRepo implements IEquipoRepo{
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public boolean guardar(Equipo eq) {
		// TODO Auto-generated method stub
				return false;
	}

	@Override
	public List<Equipo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equipo> findByCategoria(int id) {
		Object[] params = new Object[] {id};
		return jdbc.query("SELECT * FROM equipos WHERE equ_fk_categoria = ? AND equ_fecha_fin is null", new EquipoMapper(), params);
	}
}
