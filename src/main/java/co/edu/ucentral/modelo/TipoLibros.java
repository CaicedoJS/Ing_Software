package co.edu.ucentral.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="tipoLibros")
@AllArgsConstructor
@NoArgsConstructor
public class TipoLibros {
	
	private Long idTipoLibro;
	private String TipoLibro;
}
