package web.core.repositorios;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import web.core.modelo.Posicion;

@Repository
public class PosicionRepo implements IPosicionRepo{

	@Override
	public boolean guardar(Posicion object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Posicion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Posicion findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
