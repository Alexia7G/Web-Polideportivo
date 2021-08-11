package web.core.repositorios;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import web.core.modelo.Partido;

@Repository
public class PartidoRepo implements IPartidoRepo{

	@Override
	public boolean guardar(Partido object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Partido> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Partido findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
