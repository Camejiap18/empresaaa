package co.edu.uniquindio.poo.controllers;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Reserva;
import co.edu.uniquindio.poo.model.Vehiculo;

public class ReservaController {
    Empresa empresa;

    public ReservaController(Empresa empresa){
        this.empresa = empresa;
    }

    public Collection<Reserva> obtenerReservas(){
        return empresa.getListaReservas();
    }

    public Collection<Vehiculo> obtenerVehiculos(){
        return empresa.getListaVehiculos();
    }

    public Collection<Cliente> obtenerClientes(){
        return empresa.getListaClientes();
    }

    public String agregarReserva(Reserva reserva){
        int resultado = empresa.agregarReserva(reserva);
        return resultado == 1 ? "Reserva agregada exitosamente." : "Error al agregar reserva.";
    }

    public String eliminarReserva(String ID){
        int resultado = empresa.eliminarReserva(ID);
        return resultado == 1 ? "Reserva eliminada exitosamente." : "Error al eliminar reserva.";
    }

    public String actualizarReserva(Reserva reserva, String ID){
        int resultado = empresa.actualizarReserva(reserva, ID);
        return resultado == 1 ? "Reserva actualizada exitosamente." : "Error al actualizar reserva.";
    }
}
