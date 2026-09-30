package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
	private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    private String estado;
    private Mascota mascota;
    private Veterinaria veterinario;
    
    public Cita(LocalDate fecha, LocalTime hora, String motivo, String estado, Mascota mascota, Veterinaria veterinario) {
    	this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstado() {
        return estado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinaria getVeterinario() {
        return veterinario;
    }
}
