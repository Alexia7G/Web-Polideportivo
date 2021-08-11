package web.core.modelo;

public class Resultado {
	private int idResultado;
	private int partido;
	private short golesA;
	private short golesB;
	
	public int getIdResultado() {
		return idResultado;
	}
	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}
	public int getPartido() {
		return partido;
	}
	public void setPartido(int partido) {
		this.partido = partido;
	}
	public short getGolesA() {
		return golesA;
	}
	public void setGolesA(short golesA) {
		this.golesA = golesA;
	}
	public short getGolesB() {
		return golesB;
	}
	public void setGolesB(short golesB) {
		this.golesB = golesB;
	}
}
