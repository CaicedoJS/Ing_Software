package co.edu.ucentral.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;
@Data
@Entity
@Table(name="roles")
@AllArgsConstructor
@NoArgsConstructor

public class Roles implements Serializable{
	
	private Long idRol;
	private String nombreRol;
	
}
