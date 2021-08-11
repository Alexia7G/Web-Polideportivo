package web.core.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import web.core.mappers.CategoriaMapper;
import web.core.modelo.Categoria;

@Repository
public class CategoriaRepo implements ICategoriaRepo{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public boolean guardar(Categoria object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Categoria> findAll(Pageable pageable) {
		return jdbc.query("select * from categorias", new CategoriaMapper());
	}

	@Override
	public Categoria findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
