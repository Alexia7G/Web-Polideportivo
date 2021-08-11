package web.core.repositorios;

import web.core.modelo.Usuario;

public interface IUsuarioRepo extends IBaseRepo<Usuario> {
	public Usuario findByNombre(String nombre);
}
