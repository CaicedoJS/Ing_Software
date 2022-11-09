package co.edu.ucentral.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="estados")
@AllArgsConstructor
@NoArgsConstructor
public class Estado {
	private Long idEstado;
	private String nombreEstado;
}
