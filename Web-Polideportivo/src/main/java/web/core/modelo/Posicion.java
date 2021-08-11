package web.core.modelo;

public class Posicion {
	private int idPosicion;
	private int torneo;
	private int equipo;
	private short PJ;
	private short PG;
	private short PE;
	private short PP;
	private short GF;
	private short GC;
	private short DIF;
	private short puntos;
	
	public int getIdPosicion() {
		return idPosicion;
	}
	public void setIdPosicion(int idPosicion) {
		this.idPosicion = idPosicion;
	}
	public int getTorneo() {
		return torneo;
	}
	public void setTorneo(int torneo) {
		this.torneo = torneo;
	}
	public int getEquipo() {
		return equipo;
	}
	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}
	public short getPJ() {
		return PJ;
	}
	public void setPJ(short pJ) {
		PJ = pJ;
	}
	public short getPG() {
		return PG;
	}
	public void setPG(short pG) {
		PG = pG;
	}
	public short getPE() {
		return PE;
	}
	public void setPE(short pE) {
		PE = pE;
	}
	public short getPP() {
		return PP;
	}
	public void setPP(short pP) {
		PP = pP;
	}
	public short getGF() {
		return GF;
	}
	public void setGF(short gF) {
		GF = gF;
	}
	public short getGC() {
		return GC;
	}
	public void setGC(short gC) {
		GC = gC;
	}
	public short getDIF() {
		return DIF;
	}
	public void setDIF(short dIF) {
		DIF = dIF;
	}
	public short getPuntos() {
		return puntos;
	}
	public void setPuntos(short puntos) {
		this.puntos = puntos;
	}
}
