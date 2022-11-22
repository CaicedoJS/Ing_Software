package co.edu.ucentral.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;

@Data
@Entity
@Table(name="solicitudes")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.DATE)	
	private Date fechaPrestamo;
	
	@Temporal(TemporalType.DATE)
	private Date fechaDevolucion;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idPersona")
	private Persona persona;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idLibro")
	private Libros libro;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idEstado")
	private Estado estado;
	
	public Solicitud() {
	
	}
	@PrePersist
	public void prePersist() {
		fechaPrestamo = new Date();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Libros getLibro() {
		return libro;
	}

	public void setLibro(Libros libro) {
		this.libro = libro;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
	
}
