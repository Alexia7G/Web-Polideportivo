package web.core.modelo;

public class Partido {
	private int idPartido;
	private int torneo;
	private short numeroFecha;
	private int cancha;
	private int horario;
	private int equipoA;
	private int equipoB;
	private int estado;
	
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public int getTorneo() {
		return torneo;
	}
	public void setTorneo(int torneo) {
		this.torneo = torneo;
	}
	public short getNumeroFecha() {
		return numeroFecha;
	}
	public void setNumeroFecha(short numeroFecha) {
		this.numeroFecha = numeroFecha;
	}
	public int getCancha() {
		return cancha;
	}
	public void setCancha(int cancha) {
		this.cancha = cancha;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public int getEquipoA() {
		return equipoA;
	}
	public void setEquipoA(int equipoA) {
		this.equipoA = equipoA;
	}
	public int getEquipoB() {
		return equipoB;
	}
	public void setEquipoB(int equipoB) {
		this.equipoB = equipoB;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
