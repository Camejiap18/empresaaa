package co.edu.uniquindio.poo.controllers;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Reserva;

public class LoginController {
    Empresa empresa;

    public LoginController(Empresa empresa) {
        this.empresa = empresa;
    }

    public String agregarCliente(Cliente cliente) {
        int resultado = empresa.agregarCliente(cliente);
        return resultado == 1 ? "Cliente agregado exitosamente." : "Error al agregar cliente.";
    }

    public Collection<Cliente> obtenerListaClientes() {
        return empresa.getListaClientes();
    }

    public String eliminarCliente(String ID) {
        int resultado = empresa.eliminarCliente(ID);
        return resultado == 1 ? "Cliente eliminado exitosamente." : "Error al eliminar cliente.";
    }

    public String actualizarCliente(Cliente cliente, String ID) {
        int resultado = empresa.actualizarCliente(cliente, ID);
        return resultado == 1 ? "Cliente actualizado exitosamente." : "Error al actualizar cliente.";
    }

    public double calcularCostoReserva(Reserva reserva) {
        return empresa.calcularCostoReserva(reserva);
    }
}
