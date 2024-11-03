package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Camioneta extends Vehiculo{

    public double capacidadDeCarga;
    private Reserva reserva;
    private static final double PORCENTAJE_EXTRA = 0.1;

    //Cosntructor de la clase Camioneta
    public Camioneta(String matricula, String marca, String modelo, LocalDate anioFabricion, double capacidadDeCarga, Reserva reserva) {
        super(matricula, marca, modelo, anioFabricion);
        this.capacidadDeCarga = capacidadDeCarga;
        this.reserva = reserva;
    }

    //Getters y setters de la clase Camioneta
    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public static double getPorcentajeExtra() {
        return PORCENTAJE_EXTRA;
    }

    //Método abstracto de la clase Padre
    @Override
    public double calcularCosto() {
        double costoBase = reserva.getTarifaBase() * reserva.getNumeroDias();
        double costoExtra = costoBase * (capacidadDeCarga * PORCENTAJE_EXTRA);
        return costoBase + costoExtra;
    }

    //Método toString
    @Override
    public String toString() {
        return "Camioneta [capacidadDeCarga=" + capacidadDeCarga + ", reserva=" + reserva + "]";
    }
 
}
