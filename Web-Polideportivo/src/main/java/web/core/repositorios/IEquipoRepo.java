package web.core.repositorios;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import web.core.modelo.Equipo;

public interface IEquipoRepo extends IBaseRepo<Equipo>{
	public List<Equipo> findByCategoria(int id);
}
