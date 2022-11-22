package co.edu.ucentral.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.edu.ucentral.modelo.Solicitud;

@Entity
@Table(name = "estados")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstado;
	private String nombreEstado;

	@OneToMany(mappedBy = "estado", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Solicitud> solicitud;

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public List<Solicitud> getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(List<Solicitud> solicitud) {
		this.solicitud = solicitud;
	}

}
