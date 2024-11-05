package co.edu.uniquindio.poo.controllers;

import java.util.Collection;
import co.edu.uniquindio.poo.model.CajaDeCambios;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Vehiculo;

public class VehiculoController {
    Empresa empresa;

    public VehiculoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public Collection<Vehiculo> obtenerListaVehiculos() {
        return empresa.getListaVehiculos();
    }

    public String agregarVehiculo(Vehiculo vehiculo) {
        int resultado = empresa.agregarVehiculo(vehiculo);
        return resultado == 1 ? "Vehículo agregado exitosamente." : "Error al agregar vehículo.";
    }

    public String eliminarVehiculo(String matricula) {
        int resultado = empresa.eliminarVehiculo(matricula);
        return resultado == 1 ? "Vehículo eliminado exitosamente." : "Error al eliminar vehículo.";
    }

    public String actualizarVehiculo(Vehiculo vehiculo, String matricula) {
        int resultado = empresa.actualizarVehiculo(vehiculo, matricula);
        return resultado == 1 ? "Vehículo actualizado exitosamente." : "Error al actualizar vehículo.";
    }
}
