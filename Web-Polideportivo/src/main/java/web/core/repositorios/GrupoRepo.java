package web.core.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import web.core.mappers.GrupoMapper;
import web.core.modelo.Grupo;

@Repository
public class GrupoRepo implements IGrupoRepo{
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public boolean guardar(Grupo object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Grupo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grupo findById(int id) {
		Object[] params = new Object[] {id};
		return jdbc.queryForObject("select * from grupos where gru_id = ?", params, new GrupoMapper());
	}
}

