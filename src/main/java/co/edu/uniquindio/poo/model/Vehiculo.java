package co.edu.uniquindio.poo.model;
import java.time.LocalDate;

public abstract class Vehiculo {

    public String matricula, marca, modelo;
    public LocalDate anioFabricacion;

    //Constructor de la clase Vehículo
    public Vehiculo(String matricula, String marca, String modelo, LocalDate anioFabricion){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricion;
    }

    //Getters y setters de la clase Vehículo
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    //Método toString
    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", anioFabricacion="
                + anioFabricacion + "]";
    }
    
}
