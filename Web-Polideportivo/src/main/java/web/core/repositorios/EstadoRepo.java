package web.core.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import web.core.mappers.EstadosMapper;
import web.core.modelo.Estado;

@Repository
public class EstadoRepo implements IEstadorRepo{
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public boolean guardar(Estado object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Estado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado findById(int id) {
		Object[] params = new Object[] {id};
		return jdbc.queryForObject("select * from estados where est_id = ?", new EstadosMapper(), params);
	}

}
