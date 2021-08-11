package web.core.repositorios;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import web.core.modelo.Equipo;
import web.core.modelo.Torneo;

public interface IBaseRepo<T> {
	public boolean guardar(T object);
	public List<T> findAll(Pageable pageable);
	public T findById(int id);
}