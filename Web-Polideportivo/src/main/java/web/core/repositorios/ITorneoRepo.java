package web.core.repositorios;

import java.util.List;

import web.core.modelo.Equipo;
import web.core.modelo.Torneo;

public interface ITorneoRepo extends IBaseRepo<Torneo>{
	public boolean guardar(Torneo t, List<Equipo> e);
}
