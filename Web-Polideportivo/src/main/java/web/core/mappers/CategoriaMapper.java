package web.core.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.core.modelo.Categoria;

public class CategoriaMapper implements RowMapper<Categoria> {

	@Override
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categoria cat = new Categoria();
		cat.setIdCategoria(rs.getInt("cat_id"));
		cat.setNombreCat(rs.getString("cat_nombre"));
		return cat;
	}
}
