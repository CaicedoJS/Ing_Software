package co.edu.ucentral.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="categorias")
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
	private Long idCategoria;
	private String nombreCategoria;
}
