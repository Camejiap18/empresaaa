package co.edu.uniquindio.poo.model;
import java.time.LocalDate;

public class Moto extends Vehiculo {

    public CajaDeCambios cajaDeCambios;
    public Reserva reserva;

    //Constructor de la clase Moto
    public Moto (String matricula, String marca, String modelo, LocalDate anioFabricion, CajaDeCambios cajaDeCambios, Reserva reserva){
        super(matricula, marca, modelo, anioFabricion);
        this.cajaDeCambios = cajaDeCambios;
        this.reserva = reserva;
    }

    //Getters y setters de la clase Moto
    public CajaDeCambios getCajaDeCambios() {
        return cajaDeCambios;
    }

    public void setCajaDeCambios(CajaDeCambios cajaDeCambios) {
        this.cajaDeCambios = cajaDeCambios;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    //Método toString
    @Override
    public String toString() {
        return "Moto [cajaDeCambios=" + cajaDeCambios + ", reserva=" + reserva + "]";
    }

    //Método abstracto de la clase Padre
    @Override
    public double calcularCosto() {
        double costo = reserva.getTarifaBase() * reserva.getNumeroDias();
        if (cajaDeCambios == CajaDeCambios.AUTOMATICA){
            costo += reserva.getTarifaAdicional() * reserva.getNumeroDias();
        }
        return costo;
    }
}
