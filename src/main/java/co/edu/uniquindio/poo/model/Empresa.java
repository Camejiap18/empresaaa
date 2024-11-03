package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private String NIT;
    private Collection<Vehiculo> listaVehiculos = new LinkedList<>();
    private Collection<Cliente> listaClientes = new LinkedList<>();
    private Collection<Reserva> listaReservas = new LinkedList<>();

    // Constructor de la clase Empresa
    public Empresa(String nombre, String NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
    }

    // Métodos get y set de la clase Empresa
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", NIT=" + NIT + ", listaVehiculos=" + listaVehiculos + ", listaClientes="
                + listaClientes + ", listaReservas=" + listaReservas + "]";
    }

    // Métodos CRUD para Vehiculos
    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    public void actualizarVehiculo(Vehiculo vehiculo) {
        Vehiculo vehiculoExistente = buscarVehiculo(vehiculo.getMatricula());
        if (vehiculoExistente != null) {
            listaVehiculos.remove(vehiculoExistente);
            listaVehiculos.add(vehiculo);
        }
    }

    public void eliminarVehiculo(String matricula) {
        Vehiculo vehiculo = buscarVehiculo(matricula);
        if (vehiculo != null) {
            listaVehiculos.remove(vehiculo);
        }
    }

    // Métodos CRUD para Clientes
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    public void actualizarCliente(Cliente cliente) {
        Cliente clienteExistente = buscarCliente(cliente.getCedula());
        if (clienteExistente != null) {
            listaClientes.remove(clienteExistente);
            listaClientes.add(cliente);
        }
    }

    public void eliminarCliente(String cedula) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente != null) {
            listaClientes.remove(cliente);
        }
    }

    // Métodos CRUD para Reservas
    public void agregarReserva(Reserva reserva) {
        listaReservas.add(reserva);
    }

    public Reserva buscarReserva(String ID) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getID().equals(ID)) {
                return reserva;
            }
        }
        return null;
    }

    public void actualizarReserva(Reserva reserva) {
        Reserva reservaExistente = buscarReserva(reserva.getID());
        if (reservaExistente != null) {
            listaReservas.remove(reservaExistente);
            listaReservas.add(reserva);
        }
    }

    public void eliminarReserva(String ID) {
        Reserva reserva = buscarReserva(ID);
        if (reserva != null) {
            listaReservas.remove(reserva);
        }
    }
}
