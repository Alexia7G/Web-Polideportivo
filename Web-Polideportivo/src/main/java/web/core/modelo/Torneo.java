package web.core.modelo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Torneo {
	private int idTorneo;
	private String nombreT;
	private int idCategoria;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate fechaInicio;
	 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate fechaFin;
	private int idEstado;
	private short ver;
	private String nombreEstado;
	private String nombreCategoria;
	
	public int getIdTorneo() {
		return idTorneo;
	}
	public void setIdTorneo(int idTorneo) {
		this.idTorneo = idTorneo;
	}
	public String getNombreT() {
		return nombreT;
	}
	public void setNombreT(String nombreT) {
		this.nombreT = nombreT;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public short getVer() {
		return ver;
	}
	public void setVer(short ver) {
		this.ver = ver;
	}
	public String getNombreEstado() {
		return nombreEstado;
	}
	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
}
