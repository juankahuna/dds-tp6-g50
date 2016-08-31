package Clases;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class FechaEntrega {

	@Id
	private LocalDateTime fecha;
	
	@OneToOne
	private Envase envaseAEntregarEnFecha;
	
	public FechaEntrega() {}

	public FechaEntrega(Envase envaseAEntregarEnFecha, LocalDateTime fecha) {
		super();
		this.envaseAEntregarEnFecha = envaseAEntregarEnFecha;
		this.fecha = fecha;
	}
	
	private FechaEntrega(LocalDateTime fecha, Envase envaseAEntregarEnFecha) {
		this.fecha = fecha;
		this.envaseAEntregarEnFecha = envaseAEntregarEnFecha;
	}
	
	public FechaEntrega(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public FechaEntrega plusMonths(long cant) {
		return new FechaEntrega(this.fecha.plusMonths(cant), this.envaseAEntregarEnFecha);
	}
	
	public FechaEntrega plusDays(long cant) {
		return new FechaEntrega(this.fecha.plusDays(cant), this.envaseAEntregarEnFecha);
	}
	
	public void cambiarEnvase(Envase nuevoEnvase) {
		this.envaseAEntregarEnFecha = nuevoEnvase;
	}

	public int getId() {
		return this.getId();
	}
	

}