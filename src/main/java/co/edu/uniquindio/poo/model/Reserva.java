package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Reserva {
    private String ID;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int cantidadDias;
    private LocalDate fechaInicio;
    private String tipoVehiculo;

    // Constructor de la clase Reserva
    public Reserva(String ID, Cliente cliente, Vehiculo vehiculo, int cantidadDias, LocalDate fechaInicio, String tipoVehiculo) {
        this.ID = ID;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cantidadDias = cantidadDias;
        this.fechaInicio = fechaInicio;
        this.tipoVehiculo = tipoVehiculo;
    }

    // Constructor vacío
    public Reserva() {
    }

    // Getters y setters de la clase Reserva
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    //Método toString
    @Override
    public String toString() {
        return "Reserva [ID=" + ID + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", cantidadDias="
                + cantidadDias + ", fechaInicio=" + fechaInicio + ", tipoVehiculo=" + tipoVehiculo + "]";
    }



}
