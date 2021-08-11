package web.core.modelo;

public class Categoria {
	private int idCategoria;
	private String nombreCat;
	private short estado;
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCat() {
		return nombreCat;
	}
	public void setNombreCat(String nombreCat) {
		this.nombreCat = nombreCat;
	}
	public short getEstado() {
		return estado;
	}
	public void setEstado(short estado) {
		this.estado = estado;
	}
	
}
