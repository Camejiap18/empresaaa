package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private String NIT;
    private Collection<Vehiculo> listaVehiculos = new LinkedList<>();
    private Collection<Cliente> listaClientes = new LinkedList<>();
    private Collection<Reserva> listaReservas = new LinkedList<>();

    // Precio base por día
    private final static double TARIFA_BASE = 3500.0;

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

    public Collection<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(Collection<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Collection<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Collection<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    // Métodos CRUD para Vehiculos
    public int agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            listaVehiculos.add(vehiculo);
            return 1;
        }
        return 0;
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    public int actualizarVehiculo(Vehiculo vehiculo, String matricula) {
        Vehiculo vehiculoExistente = buscarVehiculo(matricula);
        if (vehiculoExistente != null) {
            listaVehiculos.remove(vehiculoExistente);
            listaVehiculos.add(vehiculo);
            return 1;
        }
        return 0;
    }

    public int eliminarVehiculo(String matricula) {
        Vehiculo vehiculo = buscarVehiculo(matricula);
        if (vehiculo != null) {
            listaVehiculos.remove(vehiculo);
            return 1;
        }
        return 0;
    }

    // Métodos CRUD para Clientes
    public int agregarCliente(Cliente cliente) {
        if (cliente != null) {
            listaClientes.add(cliente);
            return 1;
        }
        return 0;
    }

    public Cliente buscarCliente(String ID) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getID().equals(ID)) {
                return cliente;
            }
        }
        return null;
    }

    public int actualizarCliente(Cliente cliente, String ID) {
        Cliente clienteExistente = buscarCliente(ID);
        if (clienteExistente != null) {
            listaClientes.remove(clienteExistente);
            listaClientes.add(cliente);
            return 1;
        }
        return 0;
    }

    public int eliminarCliente(String ID) {
        Cliente cliente = buscarCliente(ID);
        if (cliente != null) {
            listaClientes.remove(cliente);
            return 1;
        }
        return 0;
    }

    // Métodos CRUD para Reservas
    public int agregarReserva(Reserva reserva) {
        if (reserva != null) {
            listaReservas.add(reserva);
            return 1;
        }
        return 0;
    }

    public Reserva buscarReserva(String ID) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getID().equals(ID)) {
                return reserva;
            }
        }
        return null;
    }

    public int actualizarReserva(Reserva reserva, String ID) {
        Reserva reservaExistente = buscarReserva(ID);
        if (reservaExistente != null) {
            listaReservas.remove(reservaExistente);
            listaReservas.add(reserva);
            return 1;
        }
        return 0;
    }

    public int eliminarReserva(String ID) {
        Reserva reserva = buscarReserva(ID);
        if (reserva != null) {
            listaReservas.remove(reserva);
            return 1;
        }
        return 0;
    }

    // Método para calcular el precio de la reserva de un vehículo
    public double calcularCostoReserva(Reserva reserva) {
        Vehiculo vehiculo = reserva.getVehiculo();
        int dias = reserva.getCantidadDias();
        double costo = TARIFA_BASE * dias;

        if (vehiculo instanceof Auto) {
            // Costo de la reserva para un Auto
            costo = TARIFA_BASE * dias;
        } else if (vehiculo instanceof Moto) {
            // Costo de la reserva para una Moto
            if (((Moto) vehiculo).getCajaDeCambios() == CajaDeCambios.AUTOMATICA) {
                costo += 1500.0 * dias; // Tarifa adicional por ser automática
            }
        } else if (vehiculo instanceof Camioneta) {
            // Costo de la reserva para una Camioneta
            costo += ((Camioneta) vehiculo).getCapacidadDeCarga() * 0.5 * dias; // Porcentaje extra por tonelada
        }

        return costo;
    }

}
