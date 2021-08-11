package web.core.repositorios;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import web.core.modelo.Resultado;

@Repository
public class ResultadoRepo implements IResultadoRepo{

	@Override
	public boolean guardar(Resultado object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Resultado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
